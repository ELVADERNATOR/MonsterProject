package monster.controller;
import monster.model.MarshmallowMonster;
public class Controller
{
	
	
	
	
	
	
	
	private MarshmallowMonster defaultMonster;
	
	
	
	
	private MarshmallowMonster myMonster;
	
	
	
	
	public Controller()
	{
		this.defaultMonster = new MarshmallowMonster();
		this.myMonster = new MarshmallowMonster("Lenny",2,1,true,4.5,3,10,1,true,true);
	}
	
	public void start()
		{
			System.out.println("I made a monster - Dr.FrankenMaximus_Prime");
		//	System.out.println(defaultMonster);
			
			String name = defaultMonster.getName();
			System.out.println(myMonster)
;			System.out.println(name);
		}
	
	
	
	
}
