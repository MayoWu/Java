package com.day13.test1;

import java.util.Scanner;

public class Test2 {

	/**
	 * ����:���ַ�����ת
	 * ����������¼��"abc"
	 * ��������"cba"
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(); //������¼����ַ����洢��line��
		
		/* StringBuffer sb = new StringBuffer(line); //���ַ���ת��ΪStringBuffer����
		sb.reverse();  							  //�������������ݷ�ת
	
		System.out.println(sb.toString()); */
		
		System.out.println(revString(line));
		
	}
		
		/**
		 * ���ַ�����ת
		 * 1.����ֵ����String
		 * 2.�����б�String line
		 */
	public static String revString(String line) {
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		
		return sb.toString();
		
	}
}
