package com.day13.StringBuffer;

public class demo3_StringBufferMethod {
/**
 * * A:StringBuffer的替换功能
 * 		*public StringBuffer replace(int Start,int end,String str):
 * 			* 从start开始到end用str替换
 * * B：StringBuffer的反转功能
 * * public StringBuffer reverse():
 * 		*字符串反转  
 * 
 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("HelloWorld");
		//sb.replace(0,5,"hi");
		//System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}

}
