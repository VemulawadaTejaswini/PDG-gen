import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long output = new Long(0);
      int N = sc.nextInt();
      int M = sc.nextInt();
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
      int i;
      for(i = 0; i < N; i++){
        pq.add(sc.nextInt());
      }
      for(i = 0; i < M; i++){
        int max = pq.poll();
        pq.add(max / 2);
      }
      for(i = 0; i < N; i++){
        output += pq.poll();
      }
      myout(output);
	}
}
