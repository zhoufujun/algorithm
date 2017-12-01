package algorithm.sort;
/** 
 * 冒泡排序：通过对相邻的两个元素的比较，这样一轮比较下来最大得到放在最右边，紧接着进行下一轮的比较，直到全部元素排序完。
 * @author ant 
 * @date 创建时间：2017年10月30日 上午9:43:23  
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int [] ar = {3,1,4,5,1,4,7,9,4,6};
		bubbleSort(ar);
		for (int i : ar) {
			System.out.print(i+"\t");
		}
	}
	
	public static void bubbleSort(int [] ar) {
		
//		for (int i = ar.length-1; i >= 0; i--) {
//			int max = ar[i];
//			for (int j = i-1; j >=0; j--) {
//				if (ar[j] > ar[i]) {					
//					ar[i] = ar[j];
//					ar[j] = max;
//				}
//			}
//		}
		for (int i = ar.length-1; i >=0; i--) {
			for (int j = 0; j <i; j++) {
				if (ar[j] > ar[j+1]) {
					int max = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = max;
				}
			}
		}
	}

}
