package com.day13.StringBuffer;

public class Demo1_StringBuffer {

	
	/**
	 *  *A:StringBuffer����ӹ���
	 *  public StringBuffer append(String str):
	 *  	���԰���������������ӵ��ַ������������棬�������ַ�������������
	 *  public StringBuffer insert��int offset��String str����
	 *  	��ָ��λ�ð��������͵����ݲ��뵽�ַ������������棬�������ַ�������������
	 * StringBuffer���ַ���������ȥ����new��ʱ�����ڶ��ڴ洴����һ�����󣬵ײ���һ������Ϊ6���ַ����飬
	 * ��������ӵķ���ʱ�����������´��������ڲ�����ԭ����������ַ�
	 */
	public static void main(String[] args){
		//demo1();
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3, "test"); //��ָ��λ�����Ԫ�أ����û������λ�þͻᱨ����Խ��
		
		System.out.println(sb);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("test");
		StringBuffer sb4 = sb.append(100);
		
		System.out.println(sb.toString()); //StringBuffer������д��toString��������ʾ���Ƕ��������ֵ
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}
}
