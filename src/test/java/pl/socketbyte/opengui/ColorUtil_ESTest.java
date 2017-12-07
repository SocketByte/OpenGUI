/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 07 18:22:40 GMT 2017
 */

package pl.socketbyte.opengui;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ColorUtil_ESTest extends ColorUtil_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        String[] stringArray0 = Locale.getISOCountries();
        String[] stringArray1 = ColorUtil.fixColor(stringArray0);
        assertNotSame(stringArray1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        String string0 = ColorUtil.fixColor("=X6tB!hyl");
        assertEquals("=X6tB!hyl", string0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        String string0 = ColorUtil.fixColor("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            ColorUtil.fixColor((List<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("pl.socketbyte.opengui.ColorUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ColorUtil.fixColor((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.bukkit.ChatColor", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        String[] stringArray0 = new String[1];
        // Undeclared exception!
        try {
            ColorUtil.fixColor(stringArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.bukkit.ChatColor", e);
        }
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        String[] stringArray0 = new String[0];
        String[] stringArray1 = ColorUtil.fixColor(stringArray0);
        assertNotSame(stringArray1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        ColorUtil colorUtil0 = new ColorUtil();
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        ArrayList<String> arrayList0 = new ArrayList<String>();
        arrayList0.add("");
        List<String> list0 = ColorUtil.fixColor(arrayList0);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        ArrayList<String> arrayList0 = new ArrayList<String>();
        List<String> list0 = ColorUtil.fixColor(arrayList0);
        assertEquals(0, list0.size());
    }
}
