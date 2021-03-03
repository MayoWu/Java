package com.day13.StringBuffer;

public class Demo5_StringBufferMethod {
/**
 * String --StingBuffer
 * a:通过构造方法
 * b：通过append()方法
 * B：StringBuffer --String
 * a：通过构造方法
 * b：通过toString()方法
 * c：通过subString(0，length);
 * 
 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("HelloWorld");
		
		String s1 = new String(sb); //通过构造将StringBuffer转换为String
		System.out.println(s1);
		
		String s2 = sb.toString(); //通过tostring方法将StringBuffer转换为String
		System.out.println(s2);
		
		String s3 = sb.substring(0,sb.length()); //通过substring(截取字符串)将StringBuffer转换为String 
		System.out.println(s3);
	}

private static void demo1() {
	StringBuffer sb1 = new StringBuffer("HelloWorld");
	System.out.println(sb1);
	
	StringBuffer sb2= new StringBuffer();
	sb2.append("HelloWorld");
	System.out.println(sb2);
}

}
