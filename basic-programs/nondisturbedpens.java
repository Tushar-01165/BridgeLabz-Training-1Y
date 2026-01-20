import java.util.Scanner;
class nondisturbedpens{
	public static void main (String []args){
		Scanner am=new Scanner(System.in);
		int pens = 14;
		int students = 3;
		int pensperstudent = pens / students;
		int remainingpens = pens % students;
		System.out.println("The Pen Per Student is " + pensperstudent + " and the remainingpens not disturbed is " + remainingpens);
	}
}
	
		