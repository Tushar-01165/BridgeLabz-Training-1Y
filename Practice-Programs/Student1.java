 class Student1; 
	String name;
	Student1()  {
	this( 101, "Vaibhav");
	System.out.println("Default Constructor called");
	}
	
	Student1(int id, String name) {
	 this.id = id;
	 this.name = name;
	 System.out.println("parameterized Constructor Called");
	 }
	  
	  
	   void display() {
	   System.out.println(id + " " + name);
	   }
	   public static void main(String[] args) {
	   Student1 a = new Student1();
	   s.display();
	   }
	   