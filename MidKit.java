// Brad Howard
// OCP Mid-kit

public class MidKit implements IItem
{
	private int ID;
	private double effect;
	private int stat;
	private int prefixLimit = 4;
	
	public MidKit()
	{
		ID = 9;
		effect = 20.0;
		stat = 120;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return "Mid-Kit";
	}
	
	public int getStat()
	{
		return stat;
	}
	
	public String getEffectType()
	{
		return "restoring HP/MP";
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