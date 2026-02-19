class MyRunnable implements Runnable {
    // TODO: Override run() method
    // Loop from 1 to 5 and print numbers separated by space

	@Override
	public void run(){

		for(int i=1;i<=5;i++){

			System.out.print(i);
			if(i!=5)System.out.print(" ");

		}

	}

}

public class RunnableThread {
    public static void main(String[] args) {
        // TODO: Create an instance of MyRunnable
        // TODO: Create a Thread object passing the runnable instance
        // TODO: Start the thread

	MyRunnable a= new MyRunnable();
	Thread th= new Thread(a);
	th.start();
    }
}
