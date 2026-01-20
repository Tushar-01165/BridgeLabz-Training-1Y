import java.util.Scanner;
class discountedfee {
	public static void main (String[] args){
		Scanner am=new Scanner(System.in);
		int studentfee = 125000;
		int discountpercent = 10;
		int discount = (studentfee * discountpercent) / 100;
		int finalfee = studentfee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfee );
	}
}
	