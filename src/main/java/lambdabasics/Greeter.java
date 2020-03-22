package lambdabasics;

public class Greeter {

//	-before java 8
//	public void greet() {
//		System.out.print("Hello you!");
//	}

//	-then, creating a interface call greet
	public void greet(Greeting greeting) {
		greeting.perform();
	}	

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
//		Greeting helloYouGreeting = new HelloYouGreeting();
//		-after java 8
//		Greeting greetingFunction = () -> System.out.print("Hello you!");
		Greeting lambdaGreeting = () -> System.out.print("Hello you!");
//		greeter.greet(helloYouGreeting);
//		-creat a innerClass
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.print("\nIt's me.");
			}
		};
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}	



//	-take the varible greetingFunction as a param
//	greet(greetingFuntion);
//	-look at line 11 above
//	-then, creating a interface call greet
//	-also, combine line22 and line24 as
//	greet(() -> System.out.print("Hello you!"));
//	public void greet(____) {
//		_____();
//	}				

}

//	but java does not know what is the type of greetingFunction, so
//	can use exist interface Greeting
//interface MyLambda {
//	void foo();
//}
