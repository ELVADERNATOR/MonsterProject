package monster.controller;
import monster.model.MarshmallowMonster;
public class Controller
{
	private MarshmallowMonster defaultMonster;
	
	public Controller()
	{
		this.defaultMonster = new MarshmallowMonster();
		
	}
	
	public void start()
		{
			System.out.println("I made a monster - Dr.FrankenMaximus_Prime");
			System.out.println(defaultMonster);
		}
	
	
	
	
}
