package com.day13.StringBuffer;

public class Demo6_StringBuffer {

	/**
	 * ��ʽ��������
	 * String��Ϊ��������
	 * StringBuffer��Ϊ��������
	 * 
	 * ������ʾ��
	 * String��StringBuffer�ֱ���Ϊ������������
	 * 
	 * �����������͵�ֵ���ݣ����ı���ֵ
	 * �����������͵�ֵ���ݣ��ı���ֵ
	 * 
	 * String ����Ȼ�������������ͣ�������������������ʱ�ͻ�������������һ���ġ�
	 * 
	 */
	public static void main(String[] args) {
		String s ="HelloWorld";
		System.out.println(s);
		change(s);
		System.out.println(s);
		System.out.println("------------------");
		StringBuffer sb = new StringBuffer();
		sb.append("HelloWorld");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
	}
	
	public static void change(String s) {
		s +="itcast";
	}
	public static void change(StringBuffer sb) {
		sb.append("itcast");
	}
}
