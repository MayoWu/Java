package com.day13.StringBuffer;

public class Demo2_StringBuffer {
/**
 *  *A：StringBuffer的删除功能
 *  * public StringBuffer deleteCharAt(int index):
 *  	*删除指定位置的字符，并返回本身
 *  * public StringBuffer delete(int start,int end):
 *  	*删除从指定位置开始指定位置结束的内容，并返回本身
 * 
 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//sb.deleteCharAt(5); //当缓冲区中这个索引上没有元素的时候就会报StringIndexOutOfBoundsException
		sb.append("test123");
		//sb.deleteCharAt(4); //根据索引删除索引位置上对应的字符
		//sb.delete(0,3); //删除的时候是包含头，不包含尾
		//sb.delete(0, sb.length());  //清空缓冲区
		
		sb = new StringBuffer(); //不要用这种方式清空缓冲区，原来的会变成垃圾
		System.out.println(sb);
	}

}
