package algorithm.test;
/** 
 * @author ant 
 * @date 创建时间：2017年11月3日 下午3:15:55  
 */
public class Test {

	public static void main(String[] args) {
		long i = 1;
		long j = 1;
		while (i<12345678) {		
			if ((j *= ++i) == 0) {
				break;
			}else {
				j *= ++i;
				System.out.println(j);
			}		
		}
		System.out.println(Long.MIN_VALUE + Long.MIN_VALUE);
        System.out.println(j);
	}

}
