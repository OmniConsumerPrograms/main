// Brad Howard
// OCP Med-kit

package itemset;

public class MedKit implements IItem
{
	private int ID;
	private double effect;
	private int eventID;
	private int prefixLimit = 1;
	
	public MedKit()
	{
		ID = 9;
		effect = 20.0;
		eventID = 120;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return "Med-Kit";
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