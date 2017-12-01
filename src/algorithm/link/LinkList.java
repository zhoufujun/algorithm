package algorithm.link;
/** 
 * @author ant 
 * @date 创建时间：2017年11月1日 上午9:54:12  
 */
public class LinkList {
	
	private Link first;
	
	public void insert(int value) {
		Link newLink = new Link(value);
		newLink.next = first;
		first = newLink;	
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = temp.next;
		return temp;
	}

}
