package lambdabasics;

public class TypeInference {

	public static void main(String[] args) {
//		StringLengthLambda mylamda = (String s) -> s.length();
//		-also works
//		StringLengthLambda mylamda = (s) -> s.length();
//		-also works and it's shortest one
//		StringLengthLambda mylamda = s -> s.length();
//		System.out.print(mylamda.getLenth("Hi, you!"));
//		-then, can user printlamda
		printlamda (s -> s.length());
	}
	
	public static void printlamda (StringLengthLambda l) {		
		System.out.print(l.getLenth("I am a Lamda"));	
	}
	
	
	interface StringLengthLambda{
		int getLenth(String s);
	}

}
