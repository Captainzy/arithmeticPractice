package arithmeticPractice.sort;

import java.util.concurrent.Callable;

public class TestThread implements Callable<Integer>{

	private int id;
	public TestThread(int id){
		this.id = id;
	}
	@Override
	public Integer call() throws Exception {
		String str = "";
		if(id == 1){
			str = "温度";
		}else if(id == 2){
			str = "天气";
		}else{
			str = "风速";
		}
		System.out.println(str+"任务启动");
		if(id == 1){
			Thread.sleep(5000);
			System.out.println("睡眠"+5000);
		}else if(id == 2){
			Thread.sleep(2000);
			System.out.println("睡眠"+2000);
		}else{
		}
		System.out.println(str+"任务结束");
		return id;
	}

}
