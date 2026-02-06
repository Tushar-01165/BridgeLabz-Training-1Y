import java.util.Scanner;
class ConvertKilometerstoMiles{
	public static void main(String[]args){
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the kilometers");
		int Kilometers=am.nextInt();
		double Miles = Kilometers * 0.621371;
		System.out.println(Miles);
	}
}
	