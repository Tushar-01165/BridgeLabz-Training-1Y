import java.util.Scanner;
class volumeofcyclinder {
	public static void main (String[] args){
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius = am.nextInt();
		System.out.println("Enter the height");
		int height = am.nextInt();
		float volume = 3.14f*radius*height;
		System.out.println(volume);
	}
}
	