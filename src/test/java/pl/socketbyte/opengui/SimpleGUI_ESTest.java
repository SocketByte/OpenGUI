/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 07 18:23:37 GMT 2017
 */

package pl.socketbyte.opengui;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class SimpleGUI_ESTest extends SimpleGUI_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        SimpleGUI simpleGUI0 = null;
        try {
            simpleGUI0 = new SimpleGUI(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.bukkit.Bukkit", e);
        }
    }
}
