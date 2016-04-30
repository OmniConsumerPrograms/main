// Brad Howard
// OCP IManager

public interface IManager<T>
{
	public void set(T t);
	
	public T get(int ID);
}