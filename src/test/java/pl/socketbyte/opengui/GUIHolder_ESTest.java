/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 07 18:23:49 GMT 2017
 */

package pl.socketbyte.opengui;

import org.bukkit.inventory.Inventory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNull;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class GUIHolder_ESTest extends GUIHolder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        GUIHolder gUIHolder0 = new GUIHolder(null, null);
        GUI gUI0 = gUIHolder0.getGui();
        assertNull(gUI0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        GUIHolder gUIHolder0 = new GUIHolder(null, null);
        Inventory inventory0 = gUIHolder0.getInventory();
        assertNull(inventory0);
    }
}
