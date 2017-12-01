package algorithm.stack;


/** 
 * @author ant 
 * @param <T>
 * @date 创建时间：2017年10月30日 下午3:51:25  
 */
public class QueueX{

	private int maxSize;
	private int [] queueArray;
	private int front;
	private int rear;
	private int number;
	
	public QueueX(int size) {
		this.maxSize = size;
		queueArray = new int [maxSize];
		this.front = 0;
		this.rear = -1;
		this.number = 0;
	}
	
	public void insert(int i) {
		if (rear+1 == maxSize) {
			rear = -1;
		}
		queueArray[++rear] = i;
		number ++;
	}
	
	public int remove() {
		
		int temp = queueArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		number--;
		return temp;
	}
	
	public boolean isExist() {
		return (number == 0);
	}
	
	public boolean isFull() {
		return (number == maxSize);
	}

	public int size() {
		return number;
	}
	
}
