import java.util.Collections;
import java.util.Stack;

public class SortStack {
	
	public static void main(String[] args){
		Stack<Integer> data = new Stack<>();
		data.push(31);
		data.push(45);
		data.push(3);
		data.push(0);
		data.push(66);
		data.push(5);
		
		System.out.println("Data: "+ data);
		System.out.println("Sorted stack: "+sortStack(data));
	}
	
	//to sort the stack using a temporary stack
	public static Stack<Integer> sortStack(Stack<Integer> data){
		Stack<Integer> tempStack=new Stack<Integer>();
		while(!data.isEmpty()){
			int temp=data.pop();
			while(!tempStack.isEmpty() && tempStack.peek() > temp){
				data.push(tempStack.pop());				
			}
			tempStack.push(temp);
		}
		return tempStack;		
		
	
	}
}	
	
	
	
	
	
	
	