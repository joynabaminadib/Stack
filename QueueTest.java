package arraysDataStructurePractice;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(7);
		q.enQueue(9);
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		System.out.println(q.getSize());
		
		q.deQueue();
	    q.deQueue();
		
		q.enQueue(8);
		q.enQueue(80);
		q.enQueue(82);
		q.enQueue(81);
		q.show();
	}

}
