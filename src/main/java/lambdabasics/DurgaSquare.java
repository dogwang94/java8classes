package lambdabasics;

public class DurgaSquare {

	public static void main(String[] args) {

		SquareInterf i = n->n*n;	//lambda expreass is a method so no class after compiling
		
		System.out.println(i.squareIt(4));
		System.out.println(i.squareIt(40));

	}

}

interface SquareInterf
{
	public int squareIt(int n);
}
