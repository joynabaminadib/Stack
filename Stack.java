package arraysDataStructurePractice;

public class Stack {
//lifo = last in first out
 //add- push, delete pop, find- peek
//over flow error when stack push more item bigger than its size
//underflow when pop more item when stack is empty	
//dynamic array expandable and shrinkable
	int top = 0;
		int[] stack = new int[5];
				
	
	public void push(int item) {
		if (top==5) {
			System.out.println("stack is full");
		}
		else {
		stack[top] = item;
		top++;
		}
	}
	public int pop() {
		int item = 0;
		
		if (isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
    top--;
   item = stack[top];
	stack[top] = 0;
		}	
		return  item;
		}
	public int peek() {
    int item;
   item = stack[top-1];
	return item;
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	
	public void show() {
		for(int n : stack)
		{
			System.out.print(n + " ");
			}
	System.out.println();
	}
	
	
}
