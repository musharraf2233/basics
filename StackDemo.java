package mywork;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StackDemo {
	public static void main(String[] args) {
		Stack<String> number=new Stack<>();
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		System.out.println("Stack-FirstInFirstOut");
		System.out.println(number);
		System.out.println("TOP:"+number.peek());
		Queue<String> queue=new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println("Queue-FirstInLastOut");
		System.out.println(queue);
		System.out.println("TOP:"+queue.peek()); 	
	}
}