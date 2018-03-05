# OpenGUI ![version](https://img.shields.io/badge/version-1.1e-blue.svg) [![Build Status](https://travis-ci.org/SocketByte/OpenGUI.svg?branch=master)](https://travis-ci.org/SocketByte/OpenGUI)
Simple GUI management solution.

## Installation (Maven)
Just use my public repository and set the scope to compile. 

There's no any jar file to install on the server. You just compile it with your plugin.
```xml
   <repositories>
        <repository>
            <id>opengui</id>
            <url>http://repo.socketbyte.pl/repository/nexus-releases</url>
        </repository>
   </repositories>
```
```xml
    <dependencies>
        <dependency>
            <groupId>pl.socketbyte</groupId>
            <artifactId>opengui</artifactId>
            <version>1.1e</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>
```
## Installation (Non-maven)
Download and copy the source-code into your `src` folder.

Keep in mind that you need following dependencies to get it to work.
- Bukkit or Spigot engine installed on your server. https://yivesmirror.com/downloads/spigot
- JDK/JRE 8 or higher. http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
## Compatibility
This API should be compatible with all Bukkit or Spigot
versions since `1.0`. 
I would recommend running it on a version higher than `1.7.2` though.

It was tested on Minecraft version `1.12.2`.
## Usage
It is fairly simple. *OpenGUI* has two possible usages. Object-based or standard.

Standard, and the simplest usage example:
```java
public class YourPluginClass extends JavaPlugin {
    
    public static void showGUI(Player player) {
        // Register the listeners.
        OpenGUI.INSTANCE.register(instance);
        
        // Create the GUI inventory using our special wrapper.
        GUI gui = new GUI("&cSimple Title", Rows.FIVE);
        // Create GUIExtender class and provide the GUI information.
        SimpleGUI simpleGUI = new SimpleGUI(gui);
        
        // Some additional GUI settings like entering/dragging items.
        simpleGUI.getGuiSettings().setCanEnterItems(true);
        simpleGUI.getGuiSettings().setCanDrag(true);
        
        // Set specific enterable/draggable items
        simpleGUI.getGuiSettings().addEnterableItem(Material.STONE);
        simpleGUI.getGuiSettings().addEnterableItem(Material.GOLDEN_APPLE, 1);
        
        // Set event to occur when user tries to enter non-enterable item
        simpleGUI.getGuiSettings().setNotEnterableItemResponse(
                inventoryClickEvent -> 
                    inventoryClickEvent.getWhoClicked().sendMessage(
                            "You can not enter that item!"));
        
        // Set event to occur when user enters an item successfully
        simpleGUI.getGuiSettings().setEnteredItemResponse(
                inventoryClickEvent ->
                    inventoryClickEvent.getWhoClicked().sendMessage(
                            "Entered an item!"));
        
        // #1 Set an item to a specified slot and assign an ItemBuilder
        simpleGUI.setItem(0, new ItemBuilder(Material.DIRT, 1).setName("&aTest!"));
        
        // #2 Add an item with assigned ItemBuilder
        simpleGUI.addItem(new ItemBuilder(Material.DIAMOND));
        
        // #3 Add an item with assigned ItemBuilder and ElementResponse event. (onClick)
        simpleGUI.addItem(new ItemBuilder(Material.GOLD_AXE), event ->
                System.out.println("On click event!"));
        
        // #4 Set items all together using ItemPack class.
        simpleGUI.setItem(
                new ItemPack(1, new ItemBuilder(Material.WOOD)),
                new ItemPack(2, new ItemBuilder(Material.STONE)),
                new ItemPack(3, new ItemBuilder(Material.DIAMOND_ORE)),
                new ItemPack(4, new ItemBuilder(Material.EMERALD)));
        
        // Add an element response to slot 0.
        simpleGUI.addElementResponse(0, event ->
                System.out.println("On click event at slot 0!"));
        
        // Add an element response to slot 1 and assign "pullable" value.
        // It means that you can pull out that item from the GUI and take it with you.
        simpleGUI.addElementResponse(1, true, event ->
                System.out.println("On click event at slot 1!"));
        
        // Add WindowResponse event.
        simpleGUI.addWindowResponse(new WindowResponse() {
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
        simpleGUI.removeItem(0);
        
        // Open inventory.
        // WARNING: This is important that you use our method.
        // You can use player.openInventory(inventory)
        // only when not using overrided items. (More on that in object-based usage)
        simpleGUI.openInventory(player);
    }
    
}
```

Object-based usage. (A little more complicated, this is for advanced users who are familiar with basics of object-oriented programming!)
### Custom GUI creation
```java
public class TestGUI extends GUIExtender {

    // Simple custom GUI, here you can add your items and prepare it for show.
    // Functionality of this object will be extended in the future.
    public TestGUI() {
        super(new GUI("&cSuper Title", Rows.THREE));

        getGuiSettings().setCanDrag(true);
        getGuiSettings().setCanEnterItems(true);
        // Add possible to enter material
        getGuiSettings().addEnterableItem(Material.STONE);

        // Here we can set our GUIExtenderItem class extension as a normal item.
        setItem(0, new TestItem());
        
        // Every functionality from standard usage is of course here.
        // You can add/set items, add element response or other listeners.
        // You can even override all the methods, but I don't see any useful outcomes of this.
    }
    
    @Override
    public void onOpen(InventoryOpenEvent e) {
        System.out.println("Opened!");
    }
    
    @Override
    public void onClose(InventoryCloseEvent e) {
        System.out.println("Closed!");
    }
}


```
### Custom Item (Element) creation
```java
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
        if (player.getName().equals("pl.socketbyte.opengui.Test"))
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
## JUnit
Project supports JUnit 4.
Test code is generated automatically using [EvoSuite 1.0.5](http://www.evosuite.org).

## At the end...
This project is not well written, or amazing in any case. It's usage is heavily inspired by [AmpMenus](https://github.com/Amperial/AmpMenus)
but it's a bit more rich in functionalities and still supported.

If you have any questions or issues feel free to use github issues forum.
If you want to contribute on the project you of course can.

## License and Terms of Use
**No license** basically. You can do everything with the code, but you can't distribute or sell it.
