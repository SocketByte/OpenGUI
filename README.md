# OpenGUI
Simple GUI management solution.

## Installation
Just use my public repository and set the scope to compile. 

There's no any jar file to install on the server. You just compile it with your plugin.
```
    <repositories>
        <repository>
            <id>opengui</id>
            <url>http://socketbyte.pl/repository</url>
        </repository>
    </repositories>
```
```
    <dependencies>
        <dependency>
            <groupId>pl.socketbyte</groupId>
            <artifactId>opengui</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>
```
## Usage
It is fairly simple. *OpenGUI* has two possible usages. Object-based or standard.

Standard, and the simplest usage example:
```
// Register the listeners.
OpenGUI.register(instance);

// Create the GUI inventory using our special wrapper.
GUI gui = new GUI("&cSimple Title", Rows.FIVE);
// Create GUIExtender class and provide the GUI information.
GUIExtender guiExtender = new GUIExtender(gui);

// #1 Set an item to a specified slot and assign an ItemBuilder
guiExtender.setItem(0, new ItemBuilder(Material.DIRT, 1).setName("&aTest!"));

// #2 Add an item with assigned ItemBuilder
guiExtender.addItem(new ItemBuilder(Material.DIAMOND));

// #3 Add an item with assigned ItemBuilder and ElementResponse event. (onClick)
guiExtender.addItem(new ItemBuilder(Material.GOLD_AXE), event ->
        System.out.println("On click event!"));

// #4 Set items all together using ItemPack class.
guiExtender.setItem(
        new ItemPack(1, new ItemBuilder(Material.WOOD)),
        new ItemPack(2, new ItemBuilder(Material.STONE)),
        new ItemPack(3, new ItemBuilder(Material.DIAMOND_ORE)),
        new ItemPack(4, new ItemBuilder(Material.EMERALD)));

// Add an element response to slot 0.
guiExtender.addElementResponse(0, event ->
        System.out.println("On click event at slot 0!"));

// Add an element response to slot 1 and assign "pullable" value.
// It means that you can pull out that item from the GUI and take it with you.
guiExtender.addElementResponse(1, true, event ->
        System.out.println("On click event at slot 0!"));

// Add WindowResponse event.
guiExtender.addWindowResponse(new WindowResponse() {
        @Override
        public void onOpen(InventoryOpenEvent event) {
            System.out.println("Opened!");
        }

        @Override
        public void onClose(InventoryCloseEvent event) {
            System.out.println("Closed!");
        }
});

// Remove an item from slot 0.
guiExtender.removeItem(0);

// Open inventory.
// WARNING: This is important that you use our method.
// You can use player.openInventory(inventory)
// only when not using overrided items. (More on that in object-based usage)
guiExtender.openInventory(player);
```

Object-based usage. (A little more complicated, this is for advanced users who are familiar with basics of object-oriented programming!)
### TestGUI.java
```
public class TestGUI extends GUIExtender {

    // Simple custom GUI, here you can add your items and prepare it for show.
    // Functionality of this object will be extended in the future.
    public TestGUI() {
        super(new GUI("&cSuper Title", Rows.THREE));

        getGuiSettings().setCanDrag(false);
        getGuiSettings().setCanEnterItems(false);

        // Here we can set our GUIExtenderItem class extension as a normal item.
        setItem(0, new TestItem());
        
        // Every functionality from standard usage is of course here.
        // You can add/set items, add element response or other listeners.
        // You can even override all the methods, but I don't see any useful outcomes of this.
    }
}


```
### TestItem.java
```
public class TestItem extends GUIExtenderItem {

    public TestItem() {
        // We can set here the default ItemBuilder,
        // but there's no need for it as we're overriding the getItemBuilder method
        super();

        setPullable(false);
    }

    // You can change resulting item just before the player opens the inventory.
    // The assignment of the item is made in GUIExtender.openInventory(player) method.
    @Override
    public ItemBuilder getItemBuilder(Player player) {
        if (player.getName().equals("Test"))
            return new ItemBuilder(Material.DIAMOND)
                    .setName("&bDiamond")
                    .setLore("Very nice", "Diamond");
        return new ItemBuilder(Material.GRASS)
                .setName("&2Grass")
                .setLore("Gross", "Grass");
    }

    // ElementResponse implementation.
    @Override
    public void onClick(InventoryClickEvent event) {
        System.out.println("Click!");
    }
}

```
Now you can show your amazing objects to the player using
```
TestGUI testGUI = new TestGUI();
testGUI.openInventory(player);
```
## Ending
This project is not well written, or amazing in any case. It's usage is heavily inspired by [AmpMenus](https://github.com/Amperial/AmpMenus)
but it's a bit more rich in functionalities and still supported.

If you have any questions or issues feel free to use github issues forum.
If you want to contribute on the project you of course can.

## License
No license basically. You can do everything with the code, but you can't distribute or sell it.
