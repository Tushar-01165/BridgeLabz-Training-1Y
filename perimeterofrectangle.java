import java.util.Scanner;
class perimeterofrectangle {
	public static void main (String[] args){
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the length");
		float length=am.nextFloat();
		System.out.println("Enter the Width");
		float width=am.nextFloat();
		float Perimeter = 2 * (length + width);
		System.out.println(Perimeter);
	}
}
	