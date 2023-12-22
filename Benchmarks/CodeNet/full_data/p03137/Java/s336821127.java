import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> points = new LinkedList<Integer>();
		LinkedList<Integer> dist = new LinkedList<Integer>();

		// input
		int num = scan.nextInt();
		int pointsNum = scan.nextInt();
		for(int i = 0; i < pointsNum; i++){
			points.add(scan.nextInt());
		}

		// sort
		Collections.sort(points, Comparator.reverseOrder());

		// check dist
		for(int i = 0; i < pointsNum - 1; i++){
			dist.add(points.poll() - points.peek());
		}

		// sort
		Collections.sort(dist, Comparator.reverseOrder());

		for(int i = 0; i < num - 1; i++){
			dist.poll();
		}

		// check answer
		int answer = 0;
		while(dist.size() > 0){
			answer += dist.poll();
		}

		System.out.println(answer);

	}
}

