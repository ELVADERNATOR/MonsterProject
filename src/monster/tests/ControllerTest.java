package monster.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import monster.controller.Controller;

class ControllerTest
{
	private Controller testedController;

	@BeforeEach
	void setUp() throws Exception
	{
		this.testedController = new Controller();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		this.testedController = null;
	}

	@Test
	void testConstructor()
	{
		assertTrue(testedController.getClass().getDeclaredConstructors().length == 1, "You only need a zero parameter constructor!");
		
	}
	
	@Test
	void testMethods()
	{
		Method [] methods = testedController.getClass().getDeclaredMethods();
		assertTrue(methods.length >= 5, "You need to have at least three methods in your Controller class");
		
		int expectedPublicCount = 1;
		int expectedPrivateCount = 5;
		int totalPublic = 0;
		int totalPrivate = 0;
		
		for (Method currentMethod : methods)
		{
			if(Modifier.isPrivate(currentMethod.getModifiers()))
			{
				totalPrivate++;
			}
			else if (Modifier.isPublic(currentMethod.getModifiers()))
			{
				totalPublic++;
			}	
		}
		
		assertTrue(totalPublic == expectedPublicCount, "You need only 1 public method: start");
		assertTrue(totalPrivate >= expectedPrivateCount, "You at least 5 or more private methods: one for getters, setters, conditionals,  while loops, setters & Scanner");
		
	}
	
	@Test
	void testDataMembers()
	{
		Field [] dataMembers = testedController.getClass().getDeclaredFields();
		assertTrue(dataMembers.length > 1, "You need at least 3 data members in the Controller!");
		
		for (Field currentField : dataMembers)
		{
			String name = currentField.getType().getSimpleName();
			assertTrue(name.equals("MarshmallowMonster") || name.equals("Scanner"), "Your data members should be MarshmallowMonster instances instead they are: " + name);
		}
		
		for (Field field : dataMembers)
		{
			assertTrue(Modifier.isPrivate(field.getModifiers()), "All data members must be private");
		}
		
	}

}
