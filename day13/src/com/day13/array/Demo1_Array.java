package com.day13.array;

public class Demo1_Array {
	/*
	 * ������ʾ
	 * ����߼�ð���������
	 * 
	 */
	public static void main(String[] args) {
		
		int[]arr = {24,69,80,57,13};
		bubbleSort(arr);
		print(arr);
		/*
		 * ð������
		 * 1.����ֵ���� void
		 * 2.�����б�,int[] arr
		 */
		
		
					}
	public static void bubbleSort(int[] arr) {
			for (int i=0; i< arr.length -1;i++) {
				for(int j=0;j<arr.length - 1 -i; j++) {
					if(arr[j] > arr[j+1]) {
						 int temp = arr[j];
						 arr[j] = arr[j+1];
						 arr[j+1]=temp;
					
				}
			}
		}
	}

	/*
	 * ��ӡ����
	 * 1.����ֵ����void
	 * 2.�����б�int[]arr
	 */
	public static void print(int[]arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
