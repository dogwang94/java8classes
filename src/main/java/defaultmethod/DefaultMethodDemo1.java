package defaultmethod;

interface Left
{
	default void m1()
	{
		System.out.println("in Left -> m1()");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("in Right -> m1()");
	}
}


public class DefaultMethodDemo1 implements Left , Right {
	
	public void m1()
	{
		//override m1
		//System.out.println("Custom own m1() to override the ones in Left and Right");
		//use Left m1
		//Left.super.m1();
		//use Right m1
		Right.super.m1();
	}

	public static void main(String[] args) 
	{
		DefaultMethodDemo1 dmd = new DefaultMethodDemo1();
		dmd.m1();

	}

}
