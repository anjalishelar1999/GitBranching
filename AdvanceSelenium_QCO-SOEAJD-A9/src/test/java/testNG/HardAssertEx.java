package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

	//Assertion 
	//2 types of Assertion----->HardAssert and SoftAssert
	//HardAssert:-
	//* HarsAssert is Static in nature
	//* In HardAssert when ever @Test/Assert is failed, it stops the execution in same line.
	//* If HardAssert is fail throws AssertError Exception
	//* HardAssert is used only for mandatory fields
	
	@Test
	public void m1()
	{
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals("A","A");
		System.out.println("step3");
		System.out.println("step4");
	}
	
	@Test
	public void m2()
	{
		String exp = "Shobha";
		String act = "shobha";
		Assert.assertEquals(act, exp);
	}
	
	@Test
	public void m3()
	{
		int a=10;
		int b=10;
		Assert.assertEquals(b, a, "not equal");
		System.out.println("both are equal");
	}
	
	@Test
	public void m4()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(b, a, "not equal");
		System.out.println("both are equal");
	}
	
	@Test
	public void m5()
	{
		int a=10;
		int b=20;	
		Assert.assertNotEquals(b, a,"Equal Values");
	System.out.println("Not Equal");
	}
	
	@Test
	public void m6()
	{
		int a=10;
		int b=10;	
		Assert.assertNotEquals(b, a,"Equal Values");
	System.out.println("Not Equal");
	}
	
	@Test
	public void m7()
	{
		String exp="Qspiders";
		String act="Qspiders";
		Assert.assertTrue(act.equalsIgnoreCase(exp), "AssertNotTrue");
		System.out.println("AssertTrue===");
	}
	
	@Test
	public void m8()
	{
		String exp="Qspiders";
		String act="Qspider";
		Assert.assertTrue(act.equalsIgnoreCase(exp), "AssertNotTrue");
		System.out.println("AssertTrue===");
	}
	
	@Test
	public void m9()
	{
		String exp="Qspiders";
		String act="Qspider";
		Assert.assertFalse(act.equalsIgnoreCase(exp), "Assert fail");
		System.out.println("Assert pass");
	}
	
	@Test
	public void m10()
	{
		String s=null;
		Assert.assertNull(s,"Not Null" );
		System.out.println("its Null");
	}
	
	@Test
	public void m11()
	{
		String s="Shobha";
		Assert.assertNull(s,"Not Null" );
		System.out.println("its Null");
	}
	
	@Test
	public void m12()
	{
		String s="Shobha";
		Assert.assertNotNull(s,"its Null");
		System.out.println("its  not Null");
	}
	
	@Test
	public void m13()
	{
		String exp="Qspiders";
		String act="Qspiders";
	Assert.assertSame(act, exp, "Not Same");	
	System.out.println("Assert same");

	}
	
	@Test
	public void m14()
	{
		String exp="Qspiders";
		String act="Qspiders  ";
	Assert.assertSame(act, exp, "Not Same");	
	System.out.println("Assert same");

	}
	
	@Test
	public void m15()
	{
		String exp="Qspiders";
		String act="Qspiders";
	Assert.assertNotSame(act, exp, "Same");	
	System.out.println("Assert Not same");

	}
	
	@Test
	public void m16()
	{
		Assert.fail("im failing the TestScript");
	}
}