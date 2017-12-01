package algorithm.stack;

/** 
 * @author ant 
 * @date 创建时间：2017年10月30日 下午2:20:55  
 */
public class Stackx {
	
	private int maxSize;
	private int [] stackArray;
	private int top;
	
	public Stackx(int size) {
		this.maxSize = size;
		stackArray = new int [maxSize];
		this.top = -1;
	}
	
	public void push(int i) {
		if (isFull()) {
			try {
				throw  new Exception("The size is full,can not push \""+i+"\" into it!");
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}else {
			stackArray[++top] = i;
		}		
	}
	
	public int pop() {
		if (isExist()) {
			try {
				throw  new Exception("There have not any things into it!");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return -1;
		}else {
			return stackArray[top--];
		}		
	}
	
	public int peek() {
		return stackArray[top];		
	}
	
	public boolean isExist() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top+1 >= maxSize);
	}

}
