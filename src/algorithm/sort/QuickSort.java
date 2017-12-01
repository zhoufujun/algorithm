package algorithm.sort;

import java.lang.reflect.Constructor;

/** 
 * @author ant 
 * @date 创建时间：2017年10月25日 下午3:03:33  
 */
public class QuickSort {
	
	public static void main(String[] args) {
		int [] ar = { 5, 3, 4, 2, 1, 9, 4, 8, 7 };
//		System.out.println("----排序前----");
//		print(ar);
//		System.out.println("----排序中----");
//		quickSort(ar);
//		System.out.println("----排序后----");
//		print(ar);
	}
	
	public static void quickSort(int [] ar) {
		sort(ar, 0, ar.length-1);
	}
	
	public static void sort(int[] ar,int start,int end) {
		if (start < end) {
			int q = partition(ar, start, end);
			sort(ar, start, q-1);
			sort(ar, q+1, end);
		}	
	}
	
	public static int partition(int[] ar,int start,int end) {
		int main = ar[end];
		int i = start - 1;
		for (int j = start; j <= end-1; j++) {
			if (ar[j] <= main) {
				i++;
				int temp = 0;
				temp = ar[j];
				ar[j] = ar[i];
				ar[i] = temp;
			}
		}
		int temp = 0;
		temp = ar[end];
		ar[end] = ar[i+1];
		ar[i+1] = temp;
		return i+1;
	}
	
	public static void print(int[] data) {  
        for (int i = 0; i < data.length; i++) {  
            System.out.print(data[i] + "\t");  
        }  
        System.out.println();  
    } 
  
}
