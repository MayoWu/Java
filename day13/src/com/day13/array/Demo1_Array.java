package com.day13.array;

public class Demo1_Array {
	/*
	 * 案例演示
	 * 数组高级冒泡排序代码
	 * 
	 */
	public static void main(String[] args) {
		
		int[]arr = {24,69,80,57,13};
		bubbleSort(arr);
		print(arr);
		/*
		 * 冒泡排序
		 * 1.返回值类型 void
		 * 2.参数列表,int[] arr
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
	 * 打印数组
	 * 1.返回值类型void
	 * 2.参数列表int[]arr
	 */
	public static void print(int[]arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
