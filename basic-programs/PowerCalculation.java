import java.util.Scanner;
class PowerCalculation{
	public static void main (String[]args){
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the base");
		int Base=am.nextInt();
		System.out.println("Enter the exponent");
		int Exponent=am.nextInt();
		double result=Math.pow(Base,Exponent);
		System.out.println(result);
	}
}
	
		