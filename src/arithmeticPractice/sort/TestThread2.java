package arithmeticPractice.sort;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread2 implements Runnable {
	Lock lock = new ReentrantLock();
	private Test test;
	private String name;
	public TestThread2(Test test,String name){
		this.test = test;
		this.name = name;
	}
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		synchronized (test) {
			while(test.num<=75){
					System.out.print(name+"    ");
					test.printNum();
					if((test.num-1)%5==0){
						Thread.currentThread().yield();
						try {
							test.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}	
			}
		}
	}

}
