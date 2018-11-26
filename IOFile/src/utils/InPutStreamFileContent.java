package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * 获取文件内容
 * @author Administrator
 *
 */
public class InPutStreamFileContent {
	public static void main(String[] args) {
		String fileName = "F:/test/11.txt";
		String fileName1 = "F:/work/AWS_M_ST__58361_20181010.txt";
		
		List<String> a = getFileContentSecond(fileName1);
		
		for (String string : a) {
			System.out.println(string);
		}
	}
	
	/**
	 * 获取文件第一行内容
	 * @param fileName 传入指定文件
	 * @return
	 */
	public static String getFileContent(String fileName) {
		FileInputStream fis= null;
		InputStreamReader isr = null;
		BufferedReader bf = null ;
		String content = "";
		 try {
			 fis = new FileInputStream(fileName);
			 isr = new InputStreamReader(fis, "UTF-8"); 
			 bf = new BufferedReader(isr);
			content = bf.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return content;
	}
	
	/**
	 * 获取文件从第二行开始的内容
	 */
	public static List<String> getFileContentSecond(String fileName) {
		List<String> list = new ArrayList<String>();
		FileInputStream fis= null;
		InputStreamReader isr = null;
		BufferedReader bf = null ;
		int i = 0;
		 try {
			 fis = new FileInputStream(fileName);
			 isr = new InputStreamReader(fis, "UTF-8"); 
			 bf = new BufferedReader(isr);
			 String content = "";
			 while (content != null) {
				 i++;
				 if(i==1) {
					 bf.readLine();
					 continue;
				 }
				content=bf.readLine();
				if (content == null) {
					 break;
				 }
				list.add(content);
			 }
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally{
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return list;
	}
	
}
