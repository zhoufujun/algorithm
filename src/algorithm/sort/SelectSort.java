package algorithm.sort;
/** 
 * @author ant 
 * @date 创建时间：2017年10月30日 上午10:25:37  
 */
public class SelectSort {
	
	public static void main(String[] args) {
		int [] ar = {3,1,4,5,1,4,7,9,4,6};
		selectSort(ar);
		for (int i : ar) {
			System.out.print(i+"\t");
		}
	}

	public static void selectSort(int [] ar) {	
		for (int i = 0; i < ar.length; i++) {
			 int min = i;
			for (int j = i+1; j < ar.length; j++) {
				if (ar[j] < ar[min]) {
					min = j;
				}
			}
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
	}
}
