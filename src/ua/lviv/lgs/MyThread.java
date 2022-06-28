package ua.lviv.lgs;

public class MyThread extends Thread{

	@Override
	public void run() {
		App.beta = App.inputNum();
		int num = App.beta;
		int []fib = new int [num];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < num; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(fib[i] + " ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
