package arithmeticPractice.sort;

public class ThreadTest3 implements Runnable{
	private Test test;
	public ThreadTest3(Test test){
		this.test = test;
	}
	@Override
	public void run() {
		synchronized(test){
			for(int i = 1;i<20;i++){
				System.out.print("线程3    ");
				test.printNum();
				if(i%5==0){
					System.out.println("线程3===============notify");
					test.notify();
					try {
						System.out.println("线程3===============wait");
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
