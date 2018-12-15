package arraysDataStructurePractice;

public class MyStack {

	public static void main(String[] args) {
		StackD stack = new StackD();
		stack.push(15);
		
		stack.push(8);
		System.out.println(stack.peek());
		stack.push(10);
		
	System.out.println(stack.pop());
		stack.show();
		
		System.out.println("size is"+stack.size());
	//stack.resize();
	
		stack.push(7);
		stack.push(8);
		stack.push(6);
		stack.push(7);
		stack.show();
		stack.push(8);
		stack.show();
		stack.push(6);
		System.out.println("size is"+stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	    System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.show();
	}

}
