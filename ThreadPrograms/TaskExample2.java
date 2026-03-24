public class TaskExample2 extends Thread {
	public void run() {
		for (int i=1; i<=10; i++){
			System.out.println("Task2: "+ i);
			try {
				Thread.sleep(2000);
			}
            catch (Exception e){
                System.out.println("Error Occured in Task 2...");
			}	
		}
	}
}	