import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Double> values = new LinkedList<>();
		Deque<Double> stack = new ArrayDeque<>();
		
		int num = scan.nextInt();
		for(int i = 0; i < num; i++){
			values.add(scan.nextDouble());
		}
		
		Collections.sort(values);
		stack.push(values.poll());
		
		while(!values.isEmpty()){
			stack.push((stack.pop() + values.poll()) / 2.0);
		}
		
		System.out.println(stack.pop());
		
	}
}