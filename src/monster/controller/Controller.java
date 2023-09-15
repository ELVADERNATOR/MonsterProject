package monster.controller;
import monster.model.MarshmallowMonster;
import java.util.Scanner;
public class Controller
{
	
	
	
	
	
	
	
	private MarshmallowMonster defaultMonster;
	
	private Scanner input;
	
	
	private MarshmallowMonster myMonster;
	
	
	
	
	public Controller()
	{
		this.defaultMonster = new MarshmallowMonster();
		this.myMonster = new MarshmallowMonster("Lenny",2,1,true,4.5,3,10,1,true,true);
		this.input = new Scanner (System.in);
	}
	
	public void start()
		{
			System.out.println("I made a monster - Dr.FrankenMaximus_Prime");
		//	System.out.println(defaultMonster);
			
			
			double armCount = myMonster.getArmCount();
			String name = myMonster.getName();
			System.out.println(myMonster);
			System.out.println("My monsters name was " + name);
			useSetters();
			useSettersWithScanner();
			
			input.close();
		}
	
	private void useSetters()
	{
		System.out.println("\n\n\n");
		System.out.println("the original name of the basic monster is: " + defaultMonster.getName());
		
		
		
	}
	private void useSettersWithScanner()
	{
		System.out.println("");
		System.out.println("That name is very boring, we need to change it! So what should the name be?");
		String customName = input.nextLine();
		defaultMonster.setName(customName);
		System.out.println("The Monsters name is now " + defaultMonster.getName() + "!!!");
		System.out.println("");		
		
		System.out.println("Now we need to add eyes!");
		int customEyes = input.nextInt();
		input.nextLine();
		
		
		defaultMonster.setEyeCount(customEyes);
		System.out.println(customName + " Now has "  + defaultMonster.getEyeCount() + " eyes!!");
		
		System.out.println("");	
		
		System.out.println("How many arms does your monster have?");
		
		int customArms = input.nextInt();
		input.nextLine();
		defaultMonster.setArmCount(customArms);
		
		System.out.println(customName + " Now has " + defaultMonster.getArmCount() + " arms!!");
		
		
		System.out.println("");
		
		System.out.println("How many tails does your monster have?");
		
		int customTails = input.nextInt();
		input.nextLine();
		defaultMonster.setTailCount(customTails);
		String pluralTails = "";
		if (customTails > 1)
		{
			 pluralTails = " tails!!";
		} else 
		{
			 pluralTails =  " tail!!";
		}
		System.out.println(customName + " Now has " + customTails + pluralTails);
		
		System.out.println("");
		
		System.out.println("Now we need to know how much feet it has?");
		
		String pluralFeet = "";
		int customFeet = input.nextInt();
		input.nextLine();
		defaultMonster.setFootCount(customFeet);
		
		if(customFeet > 1)
		{
			pluralFeet = " feet!!!";
		}else
		{
			pluralFeet = " foot!!!";
		}
		
		System.out.println(customName + " Now has " + customFeet + pluralFeet);
		
		
		System.out.println("");
		
		System.out.println("Did it taste good? Yes or no?");
		boolean hasTastiness = false;
		String customWasItTasty = input.nextLine();
		customWasItTasty.toLowerCase();
		if (customWasItTasty.equals("yes"))
		{
			hasTastiness = true;
		} else if (customWasItTasty.equals("no"))
		{
			hasTastiness = false;
		}
		
		defaultMonster.setHasTastiness(hasTastiness);
		
		System.out.println( "Just in a unanimous vote was submitted on whether or not " +  customName + " is tasty, (drum role please!!!) The answer is!! " + hasTastiness + "!!!!");
		System.out.println("");
		System.out.println("We need to set how tasty the mosnter is on a scale of 1 to 1000, if you want use a decimal to be precise!!");
	
		System.out.println("");
		double customTastiness = input.nextDouble();
		input.nextLine();
		defaultMonster.setTastiness(customTastiness);
		
		System.out.println(customName + " now has a " + ((customTastiness / 1000) * 100  + " %") + " Tastiness approval rating!!!");
		
		System.out.println("");
		
		System.out.println("Your monsters name is"+ customName + "and it has " + customEyes + "Eyes");
		
	}
	
	
}
