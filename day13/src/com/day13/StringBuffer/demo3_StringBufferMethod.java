package com.day13.StringBuffer;

public class demo3_StringBufferMethod {
/**
 * * A:StringBuffer���滻����
 * 		*public StringBuffer replace(int Start,int end,String str):
 * 			* ��start��ʼ��end��str�滻
 * * B��StringBuffer�ķ�ת����
 * * public StringBuffer reverse():
 * 		*�ַ�����ת  
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
