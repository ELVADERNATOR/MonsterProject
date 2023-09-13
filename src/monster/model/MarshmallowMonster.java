package monster.model;

public class MarshmallowMonster
{

	
	
	
	private String name; //lenny is special monster name
	
	private double armCount;
	private boolean hasTorso;
	private int eyeCount;
	private boolean hasEyeSocket;
	private int earCount;
	private int tailCount;
	private int legCount;
	private boolean isCute;
	private boolean hasTastiness;
	private double tastiness;
	private int footCount;
	
	public MarshmallowMonster()
	{
		this.name = "Default name";
		this.armCount = 2;
		this.hasTorso = false;
		this.eyeCount = 2;
		this.hasEyeSocket = false;
		this.earCount = 1;
		this.tailCount = 0;
		this.legCount = 2;
		this.isCute = false;
		this.hasTastiness = true;
		this.tastiness = Double.POSITIVE_INFINITY;
		this.footCount = 5;
		
	}
	
	
	public String getName()
	{
		return this.name;
	}
	public boolean getTorso()
	{
		return this.hasTorso;
	}
	public int getEyeCount()
	{
		return this.eyeCount;
	}
	public boolean getEyeSocket()
	{
		return this.hasEyeSocket;
	}
	public int getEarCount()
	{
		return this.earCount;
	}
	public int getTailCount()
	{
		return this.tailCount;
	}
	public int getLegCount()
	{
		return this.legCount;
	}
	public boolean getHasTastiness()
	{
		return this.hasTastiness;
	}
	public double getTastiness()
	{
		return this.tastiness;
	}
	public int getFootCount()
	{
		return this.footCount;
	}
	
	@Override
		public String toString()
		{
			String description = "This is a MarshmallowMonster";
			description += "\n";
			description += "Its name is " + name + ", and it has ";
			description += legCount + " legs, and this much Tastiness: ";
			description += tastiness + " . It also has " + eyeCount + " eyes";
			description += "\n";
			description += "It has " + earCount + " ears, and it has " + footCount + " feet!";
			description += "\n";
			description += "You may think its cute BUT you are " + isCute + ", however its still tasty!";
			
			return description;
		}
	
	
	
}
