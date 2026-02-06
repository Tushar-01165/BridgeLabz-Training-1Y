import java.util.Scanner;
class ArrayExample {
	public static void main (String[]args){
		Scanner am=new Scanner(System.in);
	int marks[] = {10,11,12,13,14};
	for(int i = 0; i<marks.length; i++){
	System.out.println(marks[2]);
	}
	System.out.println("Enter your element");
	int m=am.nextInt();
	for (int i = 0; i<marks.length; i++){
		if (marks[i]==m){
			System.out.println("Number found at idx: "+i);
		}	
	}
	}
}
