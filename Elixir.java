// Brad Howard
// OCP Elixir

public class Elixir implements IItem
{
	private int ID;
	private double effect;
	private int stat;
	private int prefixLimit = 4;
	
	public Potion()
	{
		ID = 1
		effect = 10.0;
		stat = 150;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return "Elixir";
	}
	
	public int getStat()
	{
		return stat;
	}
	
	public String getEffectType()
	{
		return "Restoring MP";
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