/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Thu Dec 07 18:22:40 GMT 2017
 */

package pl.socketbyte.opengui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@EvoSuiteClassExclude
public class ItemBuilder_ESTest_scaffolding {

    private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone();
    @org.junit.Rule
    public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
    private org.evosuite.runtime.thread.ThreadStopper threadStopper = new org.evosuite.runtime.thread.ThreadStopper(org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


    @BeforeClass
    public static void initEvoSuiteFramework() {
        org.evosuite.runtime.RuntimeSettings.className = "pl.socketbyte.opengui.ItemBuilder";
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
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ItemBuilder_ESTest_scaffolding.class.getClassLoader(),
                "org.bukkit.material.Button",
                "org.bukkit.material.EnderChest",
                "org.bukkit.material.Ladder",
                "org.bukkit.material.Colorable",
                "com.google.common.collect.Collections2",
                "org.bukkit.TreeSpecies",
                "org.bukkit.material.MaterialData",
                "org.bukkit.material.Diode",
                "org.bukkit.material.SmoothBrick",
                "org.bukkit.material.PistonExtensionMaterial",
                "org.bukkit.material.PressurePlate",
                "org.bukkit.material.MonsterEggs",
                "org.bukkit.material.Directional",
                "org.bukkit.material.TrapDoor",
                "org.bukkit.Material",
                "org.bukkit.material.Mushroom",
                "org.bukkit.material.Observer",
                "org.bukkit.material.types.MushroomBlockTexture",
                "org.bukkit.material.Gate",
                "org.bukkit.material.Pumpkin",
                "org.bukkit.material.TexturedMaterial",
                "org.bukkit.material.Hopper",
                "com.google.common.collect.SortedMapDifference",
                "org.bukkit.inventory.ItemStack",
                "org.bukkit.material.LongGrass",
                "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
                "org.bukkit.material.Tripwire",
                "org.bukkit.material.Banner",
                "org.bukkit.material.TripwireHook",
                "org.bukkit.material.Redstone",
                "org.bukkit.material.Step",
                "org.bukkit.material.Rails",
                "org.bukkit.material.FlowerPot",
                "com.google.common.base.Joiner",
                "org.bukkit.material.Cake",
                "org.bukkit.Server",
                "org.bukkit.material.Attachable",
                "org.bukkit.material.PoweredRail",
                "com.google.common.collect.Maps$BiMapConverter",
                "org.bukkit.material.NetherWarts",
                "org.bukkit.material.Sandstone",
                "com.google.common.base.Joiner$MapJoiner",
                "org.bukkit.material.Stairs",
                "org.bukkit.material.CocoaPlant$CocoaPlantSize",
                "com.google.common.collect.MapDifference",
                "org.bukkit.material.Skull",
                "org.bukkit.material.WoodenStep",
                "org.bukkit.material.Cauldron",
                "com.google.common.base.Preconditions",
                "com.google.common.collect.UnmodifiableIterator",
                "org.bukkit.DyeColor",
                "org.bukkit.material.PistonBaseMaterial",
                "com.google.common.base.Joiner$1",
                "org.bukkit.material.Lever",
                "com.google.common.base.Joiner$2",
                "org.bukkit.material.Torch",
                "org.bukkit.NetherWartsState",
                "org.bukkit.CropState",
                "com.google.common.collect.ImmutableEnumMap",
                "org.bukkit.block.BlockFace",
                "org.bukkit.material.Chest",
                "org.bukkit.configuration.serialization.ConfigurationSerializable",
                "org.bukkit.material.FurnaceAndDispenser",
                "org.bukkit.CoalType",
                "org.bukkit.material.PressureSensor",
                "org.bukkit.material.Furnace",
                "com.google.common.base.Converter",
                "org.bukkit.Bukkit",
                "com.google.common.collect.BiMap",
                "org.bukkit.material.SpawnEgg",
                "com.google.common.collect.Maps$6",
                "com.google.common.base.Function",
                "com.google.common.collect.ImmutableMap",
                "org.bukkit.material.RedstoneTorch",
                "org.bukkit.GrassSpecies",
                "org.bukkit.material.Sapling",
                "org.bukkit.entity.EntityType",
                "org.bukkit.material.RedstoneWire",
                "org.bukkit.plugin.messaging.PluginMessageRecipient",
                "org.bukkit.material.Crops",
                "org.bukkit.material.DetectorRail",
                "org.bukkit.material.ExtendedRails",
                "org.bukkit.material.Door",
                "org.bukkit.material.CocoaPlant",
                "org.bukkit.material.Wool",
                "org.bukkit.material.DirectionalContainer",
                "org.bukkit.material.Leaves",
                "com.google.common.collect.Multiset",
                "org.bukkit.material.Bed",
                "org.bukkit.material.Sign",
                "org.bukkit.material.SimpleAttachableMaterialData",
                "org.bukkit.material.Openable",
                "pl.socketbyte.opengui.ItemBuilder",
                "org.bukkit.material.Wood",
                "org.bukkit.material.Vine",
                "org.bukkit.material.Command",
                "org.bukkit.material.Dye",
                "org.bukkit.material.Tree",
                "org.bukkit.SandstoneType",
                "com.google.common.collect.Maps",
                "com.google.common.collect.Maps$EntryTransformer",
                "org.bukkit.material.Coal",
                "org.bukkit.material.Dispenser",
                "org.bukkit.material.Comparator"
        );
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ItemBuilder_ESTest_scaffolding.class.getClassLoader());

        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
                "com.google.common.collect.Collections2",
                "com.google.common.collect.Maps",
                "org.bukkit.Material",
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
