package arithmeticPractice.sort;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {
	public static void main(String[] args) {
		//String url = "http://localhost:8080/USM_Web/login/userLogin.do";
		Out out = new Out();
		out.printTest("123");
		String url = "http://localhost:8080/Forward_Analytical/upload.do";
		Map<String,String> map = new HashMap<String,String>();
		map.put("loginName", "silence");
		map.put("pwd", "111111abc");
		String result = "";
		File file = new File("C:/Users/zouyang/Desktop/test.txt");
		File file2 = new File("C:/Users/zouyang/Desktop/test2.txt");
		File file3 = new File("C:/Users/zouyang/Desktop/test3.txt");
		File file4 = new File("C:/Users/zouyang/Desktop/pic.png");
		File file5 = new File("C:/Users/zouyang/Desktop/pic2.png");
		List<File> list = new ArrayList<File>();
		list.add(file);
		list.add(file2);
		list.add(file3);
		list.add(file4);
		list.add(file5);
		//result = HttpClientUtil.httpPost(url, map);
		//result = HttpClientUtil.httpGet(url);
		try {
			result = HttpClientUtil.postObject(url, list, map);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
		
//		try {
//			
//			byte[] bytes = new byte[2014];
//			FileInputStream fin = new FileInputStream("C:/Users/zouyang/Desktop/test.txt");
//			FileOutputStream fout = new FileOutputStream("C:/Users/zouyang/Desktop/testOut.txt");
//			BufferedOutputStream bout = new BufferedOutputStream(fout);
//			fin.read(bytes);
//			bout.write(bytes);
//			
//			bout.flush();
//	
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
