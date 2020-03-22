package defaultmethod;

interface Myinterface1
{
	public static void m1()
	{
		System.out.println("Static Method in interface Myinterface1...");
	}
	public static void add(int a, int b)
	{
		int c = a + b;
		System.out.println("Sum is " + c);
	}
	public static void times(int a, int b)
	{
		int c = a*b;
		System.out.println("Sum is " + c);
	}
	
}

//public class StaticMethodDemo implements Myinterface1 
class StaticMethodDemo
{

	public static void main(String[] args) 
	{
		Myinterface1.m1();	//- using interface name only
		//m1();	- interface static method never get from implement class
		//StaticMethodDemo.m1();
		//StaticMethodDemo smd = new StaticMethodDemo();
		//smd.m1();
		Myinterface1.add(10, 12);
		Myinterface1.times(50, 2);
	}

}
