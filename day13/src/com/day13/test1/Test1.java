package com.day13.test1;

public class Test1 {
	/**
	 *  ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
	 *  ������
	 *  	int[] arr = {1,2,3};
	 * 	��������
	 * 		"[1,2,3]"
	 * 	��StringBuffer�Ĺ���ʵ��
	 * 
	 */
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		System.out.println(arrayToString(arr));

	}
	
	/**
	 * ������ת��Ϊ�ַ���
	 * 1.����ֵ����String
	 * 2.�����б�int[]
	 * 
	 * arrayToString ������ת��Ϊ�ַ���
	 * arrau2String 2��to�ķ���һ������2�滻��to�������ݱ����һ����дϰ��
	 * dem4j demforJ
	 */
	public static String arrayToString(int[] arr) {
		
		
		StringBuffer sb = new StringBuffer(); //�����ַ�����������
		sb.append("[");						  //��[��ӵ�������
		
		for(int i=0;i<arr.length;i++){
			//sb.append(arr[i] + ","); //������û��]
			if(i==arr.length -1) {
				sb.append(arr[i]).append("]");
			 
		}else {
			sb.append(arr[i]).append(",");
		}
	}
		return sb.toString();
		
		
	}
}
