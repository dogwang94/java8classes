package defaultmethod;

interface I
{
	default void m1() 
	{
		System.out.println("Default Method");
	}
}

public class DefaultMethodDemo implements I
{
	public void m1()
	{
		System.out.println("Overriding version of the Default Method");
	}
	public static void main(String[] args) 
	{
		DefaultMethodDemo dmd = new DefaultMethodDemo();
		dmd.m1();
	}

}
