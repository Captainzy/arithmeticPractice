package arithmeticPractice.sort;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ThreadMain {
	public static int num = 1;
	public static Lock lock = new ReentrantLock();
	public static String name = "";
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Test test = new Test("t1");
		TestThread2 t1 = new TestThread2(test,"t1");
		TestThread2 t2 = new TestThread2(test,"t2");
		TestThread2 t3 = new TestThread2(test,"t3");
		Thread t = new Thread(t1);
		Thread tt =new Thread(t2);
		Thread ttt = new Thread(t3);
		t.setPriority(2);
		t.setPriority(1);
		t.setPriority(3);

		t.start();
		tt.start();
		ttt.start();
	}
	
	
	

}
