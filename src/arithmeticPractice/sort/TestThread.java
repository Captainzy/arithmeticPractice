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
			str = "�¶�";
		}else if(id == 2){
			str = "����";
		}else{
			str = "����";
		}
		System.out.println(str+"��������");
		if(id == 1){
			Thread.sleep(5000);
			System.out.println("˯��"+5000);
		}else if(id == 2){
			Thread.sleep(2000);
			System.out.println("˯��"+2000);
		}else{
		}
		System.out.println(str+"�������");
		return id;
	}

}
