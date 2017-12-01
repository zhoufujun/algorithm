package algorithm.link;
/** 
 * @author ant 
 * @date 创建时间：2017年11月1日 上午9:58:04  
 */
public class Test {

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insert(2);
		linkList.insert(4);
        Link link = linkList.deleteFirst();
        link.display();
	}

}
