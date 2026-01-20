import java.util.Scanner;
class areaofcircle {
	public static void main (String[]args) {
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius=am.nextFloat();
		float Area = 3.14f*radius*radius;
		System.out.println(Area);
	}
}