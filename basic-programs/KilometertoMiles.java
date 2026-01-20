import java.util.Scanner;
class kmtoMiles{
	public static void main (String[]args){
		Scanner am=new Scanner(System.in);
		double km=am.nextDouble();
		double miles = km / 1.6;
		System.out.println("The total miles is " + miles + " miles for the given " + km + " km ");
	}
}
	