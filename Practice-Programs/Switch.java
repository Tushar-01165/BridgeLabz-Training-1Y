import java.util.Scanner;
class Switch {
	public static void main (String[]args){
		Scanner am=new Scanner(System.in);
	    System.out.println("Enter the value of (1-3): ");
		int day=am.nextInt();
		switch (day) {
			case 1 : 
			System.out.println("Monday");
			break;
			case 2 :
			System.out.println("Tuesday");
			break;
			case 3 :
			System.out.println("Wednesday");
			break;
			default:
			System.out.println("Invalid day");
		}
			am.close();
	}
}
	
			
		
		