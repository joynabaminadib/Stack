package arraysDataStructurePractice;

public class StackD {
    int capacity = 2;
	int top = 0;
	int[] stack = new int[capacity];
			

public void push(int item) {
	if (size()==capacity)
		expand();
	stack[top] = item;
	top++;
	
}
private void expand() {
	int length = size();
	int newStack[]= new int[capacity*2];
	System.arraycopy(stack, 0, newStack ,0, length);
	stack=newStack;
	capacity *= 2;
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
shrink(capacity/2);
	}	
	return  item;
	}
private void shrink(int i) {
	int length = size();
	if (length<=(capacity/2)/2)
		capacity = capacity/2;
	int newStack[]= new int[capacity];
	System.arraycopy(stack, 0, newStack ,0, length);
	stack=newStack;
	
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
