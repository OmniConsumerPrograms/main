// Brad Howard
// OCP Revival tag

package itemset;

public class RevivalTag implements IItem
{
	private int ID;
	private double effect;
	private int eventID;
	private int prefixLimit = 4;
	
	public RevivalTag()
	{
		ID = 13;
		effect = 25.0;
		eventID = 50;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return "Mid-Kit";
	}
	
	public int getEventID()
	{
		return eventID;
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