package algorithm.sort;

import java.util.Arrays;

/** 
 * 归并排序：其思想在于归和并上。归：递归，把要排序的序列拆分成若干子序列，直到不能再拆分（最底层的是排好序）。并：合并
 * 。两个已经排好序的子序列，从第一个元素开始比较，依次放进新的子序列，直到最后一个元素结束。
 * @author ant 
 * @date 创建时间：2017年10月24日 上午9:49:04  
 */
public class MergeSort {
	
	public static void main(String[] args) {
		int [] ar = { 5, 3, 4, 2, 1, 9, 4, 8, 7 };
		System.out.println("-----排序前-----");
		print(ar);
		System.out.println("-----排序中-----");
		mergeSort(ar, 0, ar.length-1);
		//Arrays.sort(ar);
		for (int i : ar) {
			System.out.print(i+"\t");
		}
		
		
	}

	public static void sort(int [] ar) {
		mergeSort(ar, 0, ar.length-1);
	}
	
	public static void  mergeSort(int [] ar,int start,int end) {
		if (start < end) {
			int center = (start+end) / 2;
			mergeSort(ar, start, center);
			mergeSort(ar, center+1, end);
			merge(ar, start, center, end);
		}
	}
	
	public static void merge(int [] ar,int leftStart,int rightStart,int end) {
		int leftLenght = rightStart - leftStart + 1;
		int rightLenght = end - rightStart;
		int [] left = new int [leftLenght];
		int [] right = new int [rightLenght];
		for (int i = 0; i < leftLenght; i++) {
			left[i] = ar[leftStart + i];
		}
		for (int j = 0; j < rightLenght; j++) {
			right[j] = ar[rightStart + j +1];
		}
		int m =0,n=0;
		for (int k = leftStart; k <= end; k++) {
			if (m >= left.length) {
				ar[k] = right[n++];
			}else if (n >= right.length) {
				ar[k] = left[m++];
			}else {
				if (left[m] <= right[n]) {
					ar[k] = left[m];
					m++;
				}else {
					ar[k] = right[n];
					n++;
				}
			}						
		}	
	}
	
	 public static void print(int[] data) {  
	        for (int i = 0; i < data.length; i++) {  
	            System.out.print(data[i] + "\t");  
	        }  
	        System.out.println();  
	 } 
}
