package com.day13.StringBuffer;

public class Demo4_StringBufferMethod {
 /**
  * StringBuffer�Ľ�ȡ����
  * public String substring(int start):
  * 	*��ָ��λ�ý�ȡ��ĩβ
  * public String substring(int start,int end):
  * 	*��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��
  * 	
  * 	ע���������ֵ���Ͳ�����StringBuffer����
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
