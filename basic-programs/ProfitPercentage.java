import java.util.Scanner;
class ProfitPercentage{
	public static void main (String[]args){
		Scanner am=new Scanner(System.in);
		int costprice = 129;
		int sellingprice = 191;
		int profit = sellingprice - costprice;
		double profitpercentage = (double)profit / costprice * 100;
		System.out.println("The cost price is INR" + costprice + "and sellingprice is INR" + sellingprice + "\nThe profit is INR" + profit + "and the profitpercentage is" + profitpercentage);
	}
}
	