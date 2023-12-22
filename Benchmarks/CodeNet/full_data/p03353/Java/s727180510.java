import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		sc.close();

		Queue<String> queue = new PriorityQueue<String>();
		Queue<String> queue2 = new PriorityQueue<String>();
		for(int i = 0 ; i < s.length(); i++){
			for(int j = i+1 ; j <= s.length();j++){
				queue.add(s.substring(i,j));

			}
		}
/*
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(queue.poll());
		}
*/
		ArrayList<String> list = new ArrayList<String>();
		int siz = queue.size();

		for(int i = 0 ; i < siz ; i++){
			list.add(queue.poll());
		}
		ArrayList<String>listB = new ArrayList<String>(new HashSet<>(list));
		int siz2 = listB.size();

		for(int i = 0 ; i < siz2;i++){
			queue2.add(listB.get(i));
		}

		for(int i = 0 ; i < 5 ; i++){
			if(i == 4){
			System.out.println(queue2.poll());
			}else{
				queue2.poll();
			}
		}
	}

}
