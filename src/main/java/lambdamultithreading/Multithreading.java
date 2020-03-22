package lambdamultithreading;

public class Multithreading {

	public static void main(String[] args) 
	{
		//MultiRunnable r = new MultiRunnable();
		Runnable r=()->{
			for(int i =0; i<10;i++) 
			{
				System.out.println("Child Tread with L");
			}
		};
		
		Thread t = new Thread(r);
		t.start();	//now there 2 threads main and child
		
		for (int i =0; i <10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}

/*
 * class MultiRunnable implements Runnable {
 * 
 * public void run() { for (int i =0; i <10; i++) {
 * System.out.println("Child Thread"); } }
 * 
 * }
 */
