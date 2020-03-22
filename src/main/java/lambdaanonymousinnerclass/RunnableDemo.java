package lambdaanonymousinnerclass;

public class RunnableDemo {

	public static void main(String[] args) {
			
//		Runnable r = new Runnable()
//		{
//			public void run()
//			{
//				for (int i =1; i<10; i++) {
//					System.out.println("in Child Tread");
//				}
//					
//			}
//		};
		
		//above interface implementation can be by using lambda express as
		Runnable r = ()-> {
			for (int i=0; i<10; i++) {
				System.out.println("in Child Tread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i =0; i<10; i++) {
			System.out.println("in Main Thread");
			
		}

	}

}
