import java.util.Scanner;
class StringExample {
	public static void main (String[]args){
	Scanner am=new Scanner(System.in);
	String s = "Java Programming";
	System.out.println(s.length());            // length()
	System.out.println(s.toUpperCase());       // toUpperCase()
	System.out.println(s.toLowerCase());       // toLowerCase()
	System.out.println(s.charAt(5));           // charAt()          // P
	System.out.println(s.substring(5));          //substring()    // Programming
	System.out.println(s.substring(0, 4));       // Java 
	System.out.println(s.contains("Java"));      //contains() //true
	System.out.println(s.equals("Java Programming"));    // equals()   // true
	
	}
}
	
	