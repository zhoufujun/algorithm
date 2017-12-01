package algorithm.stack;
/** 
 * @author ant 
 * @date 创建时间：2017年10月30日 下午2:31:38  
 */
public class StackApp {
	
	public static void main(String[] args) {
		Stackx stackx = new Stackx(10);
		for (int i = 0; i < 12; i++) {
			stackx.push(i);
		}
	}

}
