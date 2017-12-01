package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

/** 
 * @author ant 
 * @date 创建时间：2017年10月23日 下午3:10:29  
 */
public class InsertionSort {
	
	public static void main(String[] args) {
//		long startIn = System.currentTimeMillis();
//		QuickSort.quickSort(getArray());
//		long endIn = System.currentTimeMillis();
//		System.out.println(endIn-startIn);
//		long startMs = System.currentTimeMillis();
//		Arrays.sort(getArray());
//		long endMs = System.currentTimeMillis();
//		System.out.println(endMs-startMs);
//		Arrays.sort(getArray());
		int [] ar = { 5, 3, 4, 2, 1, 9, 4, 8, 7 };
		insertionSort2(ar);
	}
	
	public static int [] insertionSort(int [] ar) {
		for (int j = 1; j < ar.length; j++) {
			int key = ar[j];
			int i = j - 1;
			while (i >= 0 && ar[i] > key) {
				ar[i+1] = ar[i];
				i--;
			}
			ar[i+1] = key;
		}
		return ar;	
	}
	
	public static void insertionSort2(int [] a) {
		sort(a, 0, a.length-1);
	}
	
	public static void sort(int [] a,int left,int right) {
		do {
            if (left >= right) {
                return;
            }
        } while (a[++left] >= a[left - 1]);
      
        for (int k = left; ++left <= right; k = ++left) {
            int a1 = a[k], a2 = a[left];

            if (a1 < a2) {
                a2 = a1; a1 = a[left];
            }
            while (a1 < a[--k]) {
                a[k + 2] = a[k];
            }
            a[++k + 1] = a1;

            while (a2 < a[--k]) {
                a[k + 1] = a[k];
            }
            a[k + 1] = a2;
        }
        int last = a[right];

        while (last < a[--right]) {
            a[right + 1] = a[right];
        }
        a[right + 1] = last;
	}
	
	public static int [] getArray() {
		Random random = new Random(47);
		int [] ar = new int [10000000];
		for (int i = 0; i < 10000000; i++) {
			ar[i] = random.nextInt(10000000);
		}
		return ar;
	}

}
