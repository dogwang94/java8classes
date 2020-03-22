package lambdabasics;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.print("inside of Runnable");
			}
		});
		
		myThread.run();
		
		Thread myLambdaThread = new Thread (() -> System.out.print("\ninside of my Lambda Runnable"));
		myLambdaThread.run();
	}

}
