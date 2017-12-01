package algorithm.link;
/** 
 * @author ant 
 * @date 创建时间：2017年11月1日 上午9:52:32  
 */
public class Link {
	
	protected int value;
	protected Link next;
	
	public Link(int value) {
		this.value = value;
	}

	protected void display(){
		System.out.println("value:"+this.value);
	}
}
