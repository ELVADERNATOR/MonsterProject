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
		this.hasTastiness = false;
		this.tastiness = Double.POSITIVE_INFINITY;
		this.footCount = 5;
		
	}
	

	
	public MarshmallowMonster(String name,
								int earCount,
								int eyeCount,
								boolean hasTorso,
								double armCount,
								int legCount,
								int footCount,
								int tailCount,
								boolean isCute,
								boolean hasTastiness
							  )
	{
	this.name = name;
	this.legCount = legCount;
	this.eyeCount = eyeCount;
	this.hasTorso = hasTorso;
	this.earCount = earCount;
	this.tailCount = tailCount;
	this.footCount = footCount;
	this.isCute = isCute;
	this.hasTastiness = hasTastiness;
	this.tastiness = tastiness;
	this.hasEyeSocket = hasEyeSocket;
	this.armCount = armCount;
		
		
		
		
		
	}
	
	
	
	
	public boolean getHasEyeSocket()
	{
		return this.hasEyeSocket;
	}
	
	
	public double getArmCount()
	{
		return this.armCount;
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
	
	
public void setName(String name)
{
	this.name = name;
}
public void setLegCount(int legCount)
{
	this.legCount = legCount;
}
public void setArmCount(int armCount)
{
	this.armCount = armCount;
}
public void setEyeCount(int eyeCount)
{
	this.eyeCount = eyeCount;
}
public void setTailCount(int tailCount)
{
	this.tailCount = tailCount;
}
public void setTastiness(double tastiness)
{	
this.tastiness = tastiness;
}

public void setFootCount (int footCount)
{
	this.footCount = footCount;
}
public void setHasTastiness(boolean hasTastiness)
{
	this.hasTastiness = hasTastiness;
}
	
	
	
	
	
	
}
