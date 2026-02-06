import java.util.Scanner;
class SumofArray {
	public static void main (String[]args){
		Scanner am=new Scanner(System.in);
		int size=am.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter array element");
		int sum = 0;
		for (int i = 0; i<size; i++){
			arr [i]=am.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Sum of Array elements" + sum);
	}
}
			