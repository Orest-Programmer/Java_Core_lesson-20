package ua.lviv.lgs;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		
		int num = App.beta;
		int []fib = new int [num];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < num; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		System.out.println("");
		for(int i = num - 1; i >= 0; i--) {
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
