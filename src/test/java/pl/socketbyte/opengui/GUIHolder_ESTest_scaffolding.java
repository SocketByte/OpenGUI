/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Thu Dec 07 18:23:49 GMT 2017
 */

package pl.socketbyte.opengui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@EvoSuiteClassExclude
public class GUIHolder_ESTest_scaffolding {

    private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone();
    @org.junit.Rule
    public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
    private org.evosuite.runtime.thread.ThreadStopper threadStopper = new org.evosuite.runtime.thread.ThreadStopper(org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


    @BeforeClass
    public static void initEvoSuiteFramework() {
        org.evosuite.runtime.RuntimeSettings.className = "pl.socketbyte.opengui.GUIHolder";
        org.evosuite.runtime.GuiSupport.initialize();
        org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100;
        org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        org.evosuite.runtime.RuntimeSettings.mockSystemIn = true;
        org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
        org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT();
        org.evosuite.runtime.classhandling.JDKClassResetter.init();
        setSystemProperties();
        initializeClasses();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
    }

    @AfterClass
    public static void clearEvoSuiteFramework() {
        Sandbox.resetDefaultSecurityManager();
        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
    }

    public static void setSystemProperties() {

        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
        java.lang.System.setProperty("file.encoding", "Cp1250");
        java.lang.System.setProperty("java.awt.headless", "true");
        java.lang.System.setProperty("user.country", "PL");
        java.lang.System.setProperty("user.language", "pl");
        java.lang.System.setProperty("user.timezone", "Europe/Belgrade");
    }

    private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GUIHolder_ESTest_scaffolding.class.getClassLoader(),
                "org.bukkit.entity.ElderGuardian",
                "org.bukkit.entity.Explosive",
                "org.bukkit.material.EnderChest",
                "org.bukkit.material.Ladder",
                "org.bukkit.ChatColor$19",
                "org.bukkit.ChatColor$18",
                "org.bukkit.ChatColor$17",
                "com.google.common.collect.Collections2",
                "org.bukkit.ChatColor$16",
                "org.bukkit.ChatColor$15",
                "org.bukkit.TreeSpecies",
                "org.bukkit.ChatColor$14",
                "org.bukkit.material.MaterialData",
                "org.bukkit.ChatColor$13",
                "org.bukkit.ChatColor$12",
                "org.bukkit.ChatColor$22",
                "org.bukkit.material.Diode",
                "org.bukkit.ChatColor$21",
                "org.bukkit.ChatColor$20",
                "org.bukkit.entity.Enderman",
                "org.bukkit.Location",
                "org.bukkit.boss.BarColor",
                "org.bukkit.material.SmoothBrick",
                "org.bukkit.entity.Monster",
                "org.bukkit.material.PistonExtensionMaterial",
                "org.bukkit.material.PressurePlate",
                "org.bukkit.material.Directional",
                "org.bukkit.material.TrapDoor",
                "org.bukkit.projectiles.ProjectileSource",
                "org.bukkit.material.Mushroom",
                "org.bukkit.material.Observer",
                "org.bukkit.entity.Ageable",
                "org.bukkit.material.Gate",
                "org.bukkit.entity.EnderSignal",
                "org.bukkit.entity.NPC",
                "org.bukkit.entity.Entity",
                "com.google.common.collect.RegularImmutableMap",
                "com.google.common.base.Converter$IdentityConverter",
                "org.bukkit.entity.DragonFireball",
                "org.bukkit.entity.Blaze",
                "org.bukkit.material.Hopper",
                "org.bukkit.entity.ZombieVillager",
                "org.bukkit.advancement.Advancement",
                "org.bukkit.OfflinePlayer",
                "org.bukkit.ChatColor$11",
                "org.bukkit.ChatColor$10",
                "org.bukkit.material.LongGrass",
                "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
                "org.bukkit.BanList$Type",
                "org.bukkit.material.Tripwire",
                "org.bukkit.material.Banner",
                "org.bukkit.material.TripwireHook",
                "org.bukkit.material.Redstone",
                "org.bukkit.material.Step",
                "org.bukkit.entity.FallingBlock",
                "org.bukkit.material.Rails",
                "com.google.common.base.Joiner",
                "org.bukkit.entity.IronGolem",
                "org.bukkit.entity.Wither",
                "org.bukkit.Warning$WarningState",
                "org.bukkit.entity.LingeringPotion",
                "pl.socketbyte.opengui.GUIHolder",
                "org.bukkit.plugin.messaging.Messenger",
                "org.bukkit.scheduler.BukkitScheduler",
                "org.bukkit.entity.minecart.ExplosiveMinecart",
                "com.google.common.collect.Maps$BiMapConverter",
                "org.bukkit.entity.Spellcaster",
                "com.google.common.base.Joiner$MapJoiner",
                "org.bukkit.util.CachedServerIcon",
                "org.bukkit.inventory.InventoryHolder",
                "org.bukkit.entity.Shulker",
                "org.bukkit.material.Skull",
                "org.bukkit.material.WoodenStep",
                "org.bukkit.boss.BossBar",
                "org.bukkit.entity.Creeper",
                "com.google.common.base.Preconditions",
                "org.bukkit.entity.SkeletonHorse",
                "org.bukkit.plugin.PluginManager",
                "com.google.common.base.Joiner$1",
                "org.bukkit.entity.LlamaSpit",
                "org.bukkit.material.Lever",
                "com.google.common.base.Joiner$2",
                "com.google.common.base.Converter$ConverterComposition",
                "pl.socketbyte.opengui.Rows",
                "org.bukkit.entity.ThrownPotion",
                "org.bukkit.entity.Evoker",
                "org.bukkit.command.ConsoleCommandSender",
                "org.bukkit.entity.Zombie",
                "org.bukkit.CropState",
                "com.google.common.collect.ImmutableEnumMap",
                "org.bukkit.entity.Player",
                "org.bukkit.configuration.serialization.ConfigurationSerializable",
                "org.bukkit.CoalType",
                "org.bukkit.entity.Illager",
                "org.bukkit.inventory.Merchant",
                "org.bukkit.entity.minecart.PoweredMinecart",
                "org.bukkit.UnsafeValues",
                "org.bukkit.entity.Snowball",
                "org.bukkit.inventory.Recipe",
                "org.bukkit.material.PressureSensor",
                "org.bukkit.entity.PigZombie",
                "org.bukkit.entity.Boat",
                "com.google.common.collect.BiMap",
                "org.bukkit.inventory.ItemFactory",
                "org.bukkit.GrassSpecies",
                "org.bukkit.entity.MagmaCube",
                "org.bukkit.entity.minecart.CommandMinecart",
                "org.bukkit.material.Sapling",
                "org.bukkit.entity.AbstractHorse",
                "org.bukkit.BanList",
                "org.bukkit.entity.EntityType",
                "org.bukkit.entity.LivingEntity",
                "org.bukkit.entity.Stray",
                "org.bukkit.entity.LargeFireball",
                "org.bukkit.entity.Villager",
                "org.bukkit.entity.minecart.RideableMinecart",
                "org.bukkit.plugin.messaging.PluginMessageRecipient",
                "org.bukkit.entity.Ambient",
                "org.bukkit.material.Crops",
                "com.google.common.base.Converter$ReverseConverter",
                "org.bukkit.command.Command",
                "org.bukkit.material.ExtendedRails",
                "org.bukkit.entity.Parrot",
                "org.bukkit.material.Wool",
                "org.bukkit.entity.Damageable",
                "org.bukkit.material.DirectionalContainer",
                "org.bukkit.entity.Item",
                "com.google.common.collect.Multiset",
                "org.bukkit.entity.AnimalTamer",
                "org.bukkit.material.Bed",
                "org.bukkit.entity.Pig",
                "org.bukkit.material.SimpleAttachableMaterialData",
                "org.bukkit.WorldCreator",
                "org.bukkit.entity.Llama",
                "org.bukkit.GameMode",
                "org.bukkit.entity.LightningStrike",
                "org.bukkit.material.Openable",
                "pl.socketbyte.opengui.ItemBuilder",
                "com.google.common.collect.ImmutableBiMapFauxverideShim",
                "org.bukkit.entity.MushroomCow",
                "org.bukkit.boss.BarStyle",
                "org.bukkit.material.Wood",
                "org.bukkit.map.MapView",
                "org.bukkit.Color",
                "org.bukkit.material.Command",
                "net.md_5.bungee.api.ChatColor",
                "org.bukkit.ChatColor$6",
                "org.bukkit.ChatColor$5",
                "org.bukkit.ChatColor$4",
                "org.bukkit.entity.Vindicator",
                "org.bukkit.entity.minecart.SpawnerMinecart",
                "org.bukkit.ChatColor$3",
                "org.bukkit.ChatColor$2",
                "org.bukkit.ChatColor$1",
                "org.bukkit.scoreboard.ScoreboardManager",
                "org.bukkit.material.Dye",
                "org.bukkit.command.PluginIdentifiableCommand",
                "org.bukkit.ChatColor$9",
                "org.bukkit.ChatColor$8",
                "com.google.common.base.Converter$FunctionBasedConverter",
                "org.bukkit.ChatColor$7",
                "org.bukkit.entity.ShulkerBullet",
                "com.google.common.collect.Maps$EntryTransformer",
                "org.bukkit.entity.TippedArrow",
                "org.bukkit.material.Dispenser",
                "org.bukkit.entity.Fireball",
                "org.bukkit.entity.Mule",
                "org.bukkit.entity.Cow",
                "org.bukkit.ChatColor",
                "org.bukkit.entity.Witch",
                "org.bukkit.material.Button",
                "org.bukkit.entity.Slime",
                "org.bukkit.material.Colorable",
                "org.bukkit.permissions.ServerOperator",
                "org.bukkit.entity.Animals",
                "org.bukkit.entity.CaveSpider",
                "org.bukkit.entity.minecart.StorageMinecart",
                "org.bukkit.entity.ItemFrame",
                "org.bukkit.entity.EnderCrystal",
                "org.bukkit.entity.Weather",
                "org.bukkit.World",
                "org.bukkit.material.MonsterEggs",
                "org.bukkit.configuration.serialization.SerializableAs",
                "org.bukkit.Material",
                "org.bukkit.material.types.MushroomBlockTexture",
                "org.bukkit.command.CommandSender",
                "org.bukkit.entity.Rabbit",
                "org.bukkit.material.Pumpkin",
                "org.bukkit.entity.Vex",
                "org.bukkit.entity.ComplexEntityPart",
                "org.bukkit.entity.Ghast",
                "org.bukkit.material.TexturedMaterial",
                "org.bukkit.entity.Spider",
                "com.google.common.collect.SortedMapDifference",
                "org.bukkit.entity.ChestedHorse",
                "org.bukkit.inventory.ItemStack",
                "org.bukkit.entity.Hanging",
                "org.bukkit.conversations.Conversable",
                "org.bukkit.entity.FishHook",
                "org.bukkit.entity.Silverfish",
                "org.bukkit.material.FlowerPot",
                "org.bukkit.boss.BarFlag",
                "org.bukkit.entity.Painting",
                "org.bukkit.entity.SplashPotion",
                "org.bukkit.entity.LeashHitch",
                "org.bukkit.entity.Endermite",
                "org.bukkit.material.Cake",
                "org.bukkit.Keyed",
                "org.bukkit.Server",
                "org.bukkit.entity.Vehicle",
                "org.bukkit.plugin.ServicesManager",
                "org.bukkit.material.Attachable",
                "pl.socketbyte.opengui.GUI",
                "org.bukkit.material.PoweredRail",
                "org.bukkit.entity.Skeleton",
                "org.bukkit.material.NetherWarts",
                "org.bukkit.material.Sandstone",
                "org.bukkit.material.Stairs",
                "org.bukkit.entity.Bat",
                "org.bukkit.material.CocoaPlant$CocoaPlantSize",
                "com.google.common.collect.MapDifference",
                "org.bukkit.entity.Flying",
                "org.bukkit.entity.ArmorStand",
                "org.bukkit.material.Cauldron",
                "org.bukkit.entity.Golem",
                "com.google.common.collect.UnmodifiableIterator",
                "org.bukkit.DyeColor",
                "org.bukkit.entity.SmallFireball",
                "org.bukkit.entity.Egg",
                "org.bukkit.entity.Firework",
                "org.bukkit.material.PistonBaseMaterial",
                "org.bukkit.material.Torch",
                "org.bukkit.NetherWartsState",
                "org.bukkit.help.HelpMap",
                "org.bukkit.entity.Projectile",
                "org.bukkit.block.BlockFace",
                "org.bukkit.material.Chest",
                "org.bukkit.inventory.Inventory",
                "org.bukkit.material.FurnaceAndDispenser",
                "org.bukkit.entity.AreaEffectCloud",
                "org.bukkit.entity.EvokerFangs",
                "org.bukkit.entity.Sheep",
                "org.bukkit.entity.WaterMob",
                "org.bukkit.material.Furnace",
                "org.bukkit.entity.Creature",
                "org.bukkit.entity.Ocelot",
                "com.google.common.base.Converter",
                "org.bukkit.Bukkit",
                "org.bukkit.attribute.Attributable",
                "org.bukkit.material.SpawnEgg",
                "com.google.common.collect.Maps$6",
                "com.google.common.base.Function",
                "org.bukkit.entity.minecart.HopperMinecart",
                "com.google.common.collect.ImmutableMap",
                "org.bukkit.entity.Squid",
                "org.bukkit.material.RedstoneTorch",
                "org.bukkit.command.PluginCommand",
                "org.bukkit.material.RedstoneWire",
                "org.bukkit.Nameable",
                "org.bukkit.entity.Snowman",
                "org.bukkit.entity.SpectralArrow",
                "org.bukkit.entity.Guardian",
                "org.bukkit.entity.Wolf",
                "org.bukkit.entity.Horse",
                "org.bukkit.material.DetectorRail",
                "org.bukkit.entity.WitherSkeleton",
                "org.bukkit.command.CommandException",
                "com.google.common.collect.ImmutableMap$1",
                "org.bukkit.Server$Spigot",
                "org.bukkit.material.Door",
                "org.bukkit.material.CocoaPlant",
                "org.bukkit.material.Leaves",
                "org.bukkit.material.Sign",
                "org.bukkit.entity.Arrow",
                "org.bukkit.entity.ComplexLivingEntity",
                "com.google.common.collect.ImmutableBiMap",
                "org.bukkit.entity.Illusioner",
                "org.bukkit.entity.ZombieHorse",
                "org.bukkit.entity.Sittable",
                "org.bukkit.entity.Giant",
                "org.bukkit.entity.WitherSkull",
                "org.bukkit.material.Vine",
                "org.bukkit.entity.HumanEntity",
                "org.bukkit.entity.Minecart",
                "org.bukkit.entity.Donkey",
                "org.bukkit.generator.ChunkGenerator$ChunkData",
                "org.bukkit.event.inventory.InventoryType",
                "org.bukkit.NamespacedKey",
                "org.bukkit.permissions.Permissible",
                "org.bukkit.material.Tree",
                "org.bukkit.SandstoneType",
                "org.bukkit.entity.PolarBear",
                "com.google.common.collect.Maps",
                "org.bukkit.command.CommandExecutor",
                "org.bukkit.material.Coal",
                "org.bukkit.entity.ExperienceOrb",
                "org.bukkit.entity.Chicken",
                "org.bukkit.entity.Husk",
                "org.bukkit.material.Comparator",
                "org.bukkit.metadata.Metadatable",
                "org.bukkit.entity.EnderDragon",
                "org.bukkit.entity.TNTPrimed",
                "org.bukkit.entity.EnderPearl",
                "org.bukkit.entity.Tameable",
                "org.bukkit.entity.ThrownExpBottle"
        );
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GUIHolder_ESTest_scaffolding.class.getClassLoader());

        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
                "org.bukkit.ChatColor$1",
                "org.bukkit.ChatColor$2",
                "org.bukkit.ChatColor$3",
                "org.bukkit.ChatColor$4",
                "org.bukkit.ChatColor$5",
                "org.bukkit.ChatColor$6",
                "org.bukkit.ChatColor$7",
                "org.bukkit.ChatColor$8",
                "org.bukkit.ChatColor$9",
                "org.bukkit.ChatColor$10",
                "org.bukkit.ChatColor$11",
                "org.bukkit.ChatColor$12",
                "org.bukkit.ChatColor$13",
                "org.bukkit.ChatColor$14",
                "org.bukkit.ChatColor$15",
                "org.bukkit.ChatColor$16",
                "org.bukkit.ChatColor$17",
                "org.bukkit.ChatColor$18",
                "org.bukkit.ChatColor$19",
                "org.bukkit.ChatColor$20",
                "org.bukkit.ChatColor$21",
                "org.bukkit.ChatColor$22",
                "org.bukkit.ChatColor",
                "org.bukkit.Bukkit"
        );
    }

    @Before
    public void initTestCase() {
        threadStopper.storeCurrentThreads();
        threadStopper.startRecordingTime();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler();
        org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode();
        setSystemProperties();
        org.evosuite.runtime.GuiSupport.setHeadless();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
        org.evosuite.runtime.agent.InstrumentingAgent.activate();
    }

    @After
    public void doneWithTestCase() {
        threadStopper.killAndJoinClientThreads();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks();
        org.evosuite.runtime.classhandling.JDKClassResetter.reset();
        resetClasses();
        org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode();
        org.evosuite.runtime.agent.InstrumentingAgent.deactivate();
        org.evosuite.runtime.GuiSupport.restoreHeadlessMode();
    }
}
