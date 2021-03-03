package com.day13.StringBuffer;

public class Demo4_StringBufferMethod {
 /**
  * StringBuffer的截取功能
  * public String substring(int start):
  * 	*从指定位置截取到末尾
  * public String substring(int start,int end):
  * 	*截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
  * 	
  * 	注意事项：返回值类型不再是StringBuffer本身
  * @param args
  */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("HelloWorld");
		String str = sb.substring(5);
		//System.out.println(str);
		//System.out.println(sb);
		
		String str1 = sb.substring(5,9);
		System.out.println(str1);
	}

}
