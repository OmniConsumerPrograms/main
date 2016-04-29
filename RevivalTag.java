// Brad Howard
// OCP Revival tag

public class RevivalTag implements IItem
{
	private int ID;
	private double effect;
	private int stat;
	private int prefixLimit = 4;
	
	public RevivalTag()
	{
		ID = 13;
		effect = 25.0;
		stat = 50;
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