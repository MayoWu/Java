package com.day13.StringBuffer;

public class Demo2_StringBuffer {
/**
 *  *A��StringBuffer��ɾ������
 *  * public StringBuffer deleteCharAt(int index):
 *  	*ɾ��ָ��λ�õ��ַ��������ر���
 *  * public StringBuffer delete(int start,int end):
 *  	*ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
 * 
 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//sb.deleteCharAt(5); //�������������������û��Ԫ�ص�ʱ��ͻᱨStringIndexOutOfBoundsException
		sb.append("test123");
		//sb.deleteCharAt(4); //��������ɾ������λ���϶�Ӧ���ַ�
		//sb.delete(0,3); //ɾ����ʱ���ǰ���ͷ��������β
		//sb.delete(0, sb.length());  //��ջ�����
		
		sb = new StringBuffer(); //��Ҫ�����ַ�ʽ��ջ�������ԭ���Ļ�������
		System.out.println(sb);
	}

}
