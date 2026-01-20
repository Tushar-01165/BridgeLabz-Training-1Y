import java.util.Scanner;
class AverageofThreeNumbers{
	public static void main (String[]args){
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the first value");
		int firstvalue=am.nextInt();
		System.out.println("Enter the second value");
		int secondvalue=am.nextInt();
		System.out.println("Enter the third value");
		int thirdvalue=am.nextInt();
		int average=(firstvalue + secondvalue + thirdvalue) / 3;
		System.out.println(average);
	}
}
	