package com.day13.StringBuffer;

public class Demo5_StringBufferMethod {
/**
 * String --StingBuffer
 * a:ͨ�����췽��
 * b��ͨ��append()����
 * B��StringBuffer --String
 * a��ͨ�����췽��
 * b��ͨ��toString()����
 * c��ͨ��subString(0��length);
 * 
 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("HelloWorld");
		
		String s1 = new String(sb); //ͨ�����콫StringBufferת��ΪString
		System.out.println(s1);
		
		String s2 = sb.toString(); //ͨ��tostring������StringBufferת��ΪString
		System.out.println(s2);
		
		String s3 = sb.substring(0,sb.length()); //ͨ��substring(��ȡ�ַ���)��StringBufferת��ΪString 
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
