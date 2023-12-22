import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> points = new LinkedList<>();
		List<Integer> distances = new ArrayList<>();
		int answer;
		int min = Integer.MAX_VALUE;
		
		// input
		final int NUM = scan.nextInt();
		for(int i = 0; i <= NUM; i++){
			points.add(scan.nextInt());
		}
		
		// sort
		Collections.sort(points);
		
		// check distance
		while(points.size() > 1){
			distances.add((points.poll() - points.peek()) * -1);
		}
		
		// check answer
		for(int i = 0; i < NUM; i++){
			if(distances.get(i) < min){
				min = distances.get(i);
			}
		}
		
		System.out.println(min);
		

	}
}