package ua.lviv.lgs;

import java.util.Scanner;

public class App {
	private static Object RunnableThread;
	public static int beta;
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		try {
			myThread.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t = new Thread(new RunnableThread());
		t.start();
		
	}
	
	public static int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a count of Fibonachi number what you want display: ");
		int x = sc.nextInt();
		return x;
	}
}
