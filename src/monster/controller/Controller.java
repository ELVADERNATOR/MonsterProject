package monster.controller;
import monster.model.MarshmallowMonster;

import java.util.ArrayList;
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
			System.out.println(defaultMonster);
		
		
		double armCount = myMonster.getArmCount();
		String name = myMonster.getName();
			System.out.println(myMonster);
			System.out.println("My monsters name was " + name);
			
			
			
			useArrayList();
			
//			useSetters();
//			useSettersWithScanner();
//			monsterUseConditionals();
//			useWhileLoops();
//			useConditionals();
//			useForLoops();
//			useNestedLoops();
			input.close();
		}
	
	
	private void useArrayList()
	{
		ArrayList<MarshmallowMonster> firstList = new ArrayList<MarshmallowMonster>();
		ArrayList<MarshmallowMonster> secondList = new ArrayList<MarshmallowMonster>();
		
		for (int index = 0; index < 10; index++)
		{
			MarshmallowMonster demo = new MarshmallowMonster();
			firstList.add(demo);
		}
		
		for (int index = 0; index <  10; index++)
		{
			MarshmallowMonster current = firstList.get(index);
			
			String currentName = "";
			double tastiness = 0.0;
			System.out.println("What is the name of Monster: " + (index + 1)); // keeps the original index value, however adds one so it looks like we start at 1 rather than 0. indecies left unchanged
			currentName = input.nextLine();
			current.setName(currentName);
			input.nextDouble();
			System.out.println("What was the tastiness the of Monster at: " + (index + 1));
			System.out.println("The range was 0 - 1000");
			defaultMonster.setTastiness(tastiness);
			System.out.println("The monster at " + (index + 1) + " has a name of: " + current.getName());
			

			}
		for (int index = 0; index < 10; index++)
		{
			MarshmallowMonster demo = new MarshmallowMonster();
			secondList.add(demo);
		}
		
		for (int index = 0; index <  10; index++)
		{
			MarshmallowMonster current = secondList.get(index);
			String name = "";
			boolean isItTasty = defaultMonster.getHasTastiness();
			String tasty1= "";
			double tastiness = 0.0;
			System.out.println("What is the name of Monster: " + (index + 1)); // keeps the original index value, however adds one so it looks like we start at 1 rather than 0. indecies left unchanged
			
			name = input.nextLine();
			System.out.println("What was the tastiness the of Monster at: " + (index + 1));
			System.out.println("Was it tasty? Yes or No");
			tasty1.toLowerCase();
			tasty1 = input.nextLine();
			
			if (tasty1.equals ("yes"))
			{
				isItTasty = true;
				defaultMonster.setHasTastiness(isItTasty);
			} else
			{
				isItTasty = false;
				defaultMonster.setHasTastiness(isItTasty);
			}
			
			current.getHasTastiness();
			System.out.println("What was the tastiness factor?");
						System.out.println("The range was 0 - 1000");

						input.nextDouble();
			
			defaultMonster.setTastiness(tastiness);
			String was = "";
			if (isItTasty = true)
			{
				was = " tasty ";
			}else
			{
				was = " not tasty ";
			}
			System.out.println("The monster at " + (index + 1) + " has a name of: " + current.getName() + "It was");
			

			}
		
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
		System.out.println(defaultMonster.getName() + " Now has "  + defaultMonster.getEyeCount() + " eyes!!");
		
		System.out.println("");	
		
		System.out.println("How many arms does your monster have?");
		
		int customArms = input.nextInt();
		input.nextLine();
		defaultMonster.setArmCount(customArms);
		
		System.out.println(defaultMonster.getName() + " Now has " + defaultMonster.getArmCount() + " arms!!");
		
		
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
		System.out.println(defaultMonster.getName() + " Now has " + defaultMonster.getTailCount() + pluralTails);
		
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
		
		System.out.println(defaultMonster.getName() + " Now has " + defaultMonster.getFootCount() + pluralFeet);
		
		
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
		
		System.out.println( "Just in a unanimous vote was submitted on whether or not " +  defaultMonster.getName() + " is tasty, (drum role please!!!) The answer is!! " + defaultMonster.getHasTastiness() + "!!!!");
		System.out.println("");
		System.out.println("We need to set how tasty the mosnter is on a scale of 1 to 1000, if you want use a decimal to be precise!!");
	
		System.out.println("");
		double customTastiness = input.nextDouble();
		input.nextLine();
		defaultMonster.setTastiness(customTastiness);
		
		System.out.println(defaultMonster.getName() + " now has a " + ((defaultMonster.getTastiness() / 1000) * 100  + " %") + " Tastiness approval rating!!!");
		
		System.out.println("");
		String isNot = "";
		if (hasTastiness == true)
				{
			isNot = " is ";
			
				} else
				{
					isNot = " is not ";
					
				}
		
		System.out.println("Your monsters name is "+ defaultMonster.getName() + " and it has " + defaultMonster.getEyeCount() + " Eyes! It also has " + defaultMonster.getArmCount() + " arms, " + defaultMonster.getName() + isNot + "tasty! " + defaultMonster.getName()+" has " +defaultMonster.getTailCount() + pluralTails + " " +defaultMonster.getName()+ " Has " + defaultMonster.getFootCount() + pluralFeet + " " + defaultMonster.getName() + " also has a tastiness approval rating of: " + defaultMonster.getTastiness() + " Thats your monster!");
		
	}
	
	private void monsterUseConditionals()
	{
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		boolean check5 = false;
		boolean successCheck = false;
		String monsterEyeAward = "Congrats, your craftsmanship has earned you the 'Im always Watching' Award!!!";
		String monsterArmAward = "Congrats, your craftsmanship has earned you the 'Beyblade' Award!!!";
		String monsterTailAward = "Congrats, your craftsmanship has earned you the 'Iron Tail' Award!!!";
		String monsterTastinessAward= "Congrats, your craftsmanship has earned you the 'Better than Gordon Ramseys' Award!!!"; 
		String monsterFootAward = "Congrats, your craftsmanship has earned you the 'Athletes Foot?'  Award!!!";
		String allAroundMonsterAward = "Congrats, you have unlocked the ultimate 'Monster Maker' Award!!!";
		
		if (defaultMonster.getEyeCount() > 25 && defaultMonster.getEyeCount() < 40)
		{
			System.out.println("");
			System.out.println(monsterEyeAward);
			check1 = true;
		}  else
		{
			check1 = false;
		}
		
		if (defaultMonster.getArmCount() > 10 && defaultMonster.getArmCount() < 20)
		{
			System.out.println("");

			System.out.println(monsterArmAward);
			check2 = true;
		} else
		{
			check2 = false;
		}
		
		
		if (defaultMonster.getTailCount() > 30 && defaultMonster.getTailCount() < 40)
		{
			System.out.println("");

			System.out.println(monsterTailAward);
			check3 = true;
		}else
		{
			check3 = false;
		}
		if (defaultMonster.getTastiness() > 800 && defaultMonster.getTastiness() < 900)
		{
			System.out.println("");

			System.out.println(monsterTastinessAward);
			check4 = true;
		}else
		{
			check4 = false;
		}
		
		if (defaultMonster.getFootCount() > 20)
		{
			System.out.println("");

			System.out.println(monsterFootAward);
			check5 = true;
		}
		
		if (check1 == true && check2 == true && check3 == true && check4 == true && check5 == true )
		{
			System.out.println("");
			
			
			System.out.println(allAroundMonsterAward);
			successCheck = true;
		}
		
		while (successCheck == true)
		{
			int count = 1;
		
				while (successCheck == true)
				{
					System.out.println("BEST MONSTER MAKER");
					count++;
				}
				
			if (count == 1000)
			{
				
				System.out.println("You should have given us more air capacity -_-" );
			}
		}
		
		
		
		
	}
	private void useConditionals()
	{
		System.out.println("Welcome to Revenge of the Tasties");
		String yourName = "";
		System.out.println("Whats your name");
		yourName = input.nextLine();
		System.out.print("\n\n\n");
		System.out.println("Type yes or no.");
		String didItTasteGood = "";
		didItTasteGood = input.nextLine();
		didItTasteGood.toLowerCase();
		
		boolean isItGood = false;
		if (didItTasteGood.equals("yes"))
		{
			isItGood = true;
		}else
		{
			isItGood = false;
		}
		
		defaultMonster.setHasTastiness(isItGood);
		boolean isTasty = defaultMonster.getHasTastiness();
		
		if (isTasty)
		{
			System.out.println("This monster is giving signs of tastiness");
		}
		
		if (!isTasty)
		{
			System.out.println("There is no sign of a tasty monster here");
		}
		
		if (isTasty)
		{
			System.out.println("Its been confirmed");
		}else 
		{
			System.out.println("Liar! You were my brother " + yourName + ", your were supposed to bring balance to the monsers, not leave them tastinessless!");
		}
		
		if (defaultMonster.getLegCount() > 100)
		{
			System.out.println("That is a serious amount of legs");
		} else if (defaultMonster.getLegCount() > 40)
		{
			System.out.println("Man do you have an easy time walking with those???");
		}else if (defaultMonster.getLegCount() > 5)
		{
			System.out.println("Alright, alright, you got some legs.");
		}
		else 
		{
			System.out.println("There are this many legs: " + defaultMonster.getLegCount());
		}
	}
	
	private void useWhileLoops()
	{
		int legs = 0;
		System.out.println("Pick a number over 100");
		legs = input.nextInt();
		defaultMonster.setLegCount(legs);
		boolean isFinished = true;
		
		System.out.println("Keep on goin!!");

		
		
				while (!isFinished)
		{
			System.out.println("hi");
			isFinished = true;
				
			}
				
		
		
		while (defaultMonster.getLegCount() > 0)
		{
			System.out.println("Legs are: " + defaultMonster.getLegCount());
			defaultMonster.setLegCount(defaultMonster.getLegCount() - 4);
		}
	}
	
	private void useForLoops()
	{
		String name = myMonster.getName();
		for (int index = 0; index < name.length(); index++)
		{
			String letter = name.substring(index, index + 1);
			System.out.println(letter);
		}
		System.out.println("");
		
		name = defaultMonster.getName();
		for (int index = 0; index < name.length(); index++)
		{
			String letter = name.substring(index, index + 1);
			System.out.println(letter);
		}
	
		
		for (int index = 0; index < 10; index++)
		{
			MarshmallowMonster demo = new MarshmallowMonster();
			System.out.println(demo.getName());
			
			for (int count = 0; count <= 10;count++)
			{
				try {
					Thread.sleep(250);
			
				
				
				System.out.println(count);
				System.out.println("Your awesome!");
				   }
				catch(InterruptedException e) 
				{
					System.out.println("There was an error" + e.getMessage());
				}
			}
		}
	}


	private void useNestedLoops()
	{
		for (int index = 0; index < 10; index++)
		{
			System.out.println("This is the outer loop");
			for (int inner = 0; inner  < 20; inner++)
			{
				System.out.println("The inner loop is at: " + inner + " and index is: " + index);
			}
			System.out.println("Outer loop completes number: " + index);
		
		}
		
		for (int hours1 = 0; hours1 < 24; hours1++)
		{
			for (int minutes1 = 0; minutes1 < 60; minutes1++)
			{
				for (int seconds1 = 0; seconds1 < 60; seconds1++)
				{
					System.out.println("H: " + hours1 + " m: " + minutes1 + " S: " + seconds1);
				}
			}
		}
		
		
		for (int hours = 0; hours < 24;hours++)
		{
			
			for (int minutes = 0; minutes < 60; minutes++)
			{
				
				
				for (int seconds = 0; seconds < 60; seconds++)
				{
					try {
						Thread.sleep(1);
						
						System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds ");
					}
					catch (InterruptedException e)
					{
						System.out.println("There was an error" + e.getMessage());
					}
					
				}
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		for (int lives = 1; lives >= 1; lives--)
		{
			
			int damage = 0;
			int recover = 0;
			
			for (int health = 100; health > 1;)
			{
			System.out.println("Your health is at: " + health);
			System.out.println("Pick a number 20 through 30");
			damage = input.nextInt();
			health -= damage;
			System.out.println("pick a number 1 throught 10");
			recover = input.nextInt();
			health += recover;
		
			}
		
			
			
			
		}
		
	}
	
}

