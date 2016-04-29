// Brad Howard
// OCP potion

public class Potion implements IItem
{
	private int ID;
	private double effect;
	private int stat;
	private int prefixLimit = 4;
	
	public Potion()
	{
		ID = 1;
		effect = 10.0;
		stat = 100;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return "Potion";
	}
	
	public int getStat()
	{
		return stat;
	}
	
	public String getEffectType()
	{
		return "Healing HP";
	}
	
	public double getEffect()
	{
		return effect;
	}
	
	public int getPFLimit()
	{
		return prefixLimit;
	}
} 