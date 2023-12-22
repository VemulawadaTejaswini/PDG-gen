import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int x;
	int y;
	int z;
	Point(int a,int b,int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int[] A = new int[N];
		Queue<Integer> queue = new PriorityQueue<Integer>();

		for(int i = 0 ; i < N ; i++){
			//A[i] = sc.nextInt();
			queue.add(sc.nextInt());
		}

		sc.close();
		int count = 0;
		int prev = queue.poll();
		long sum = prev;

		while(!queue.isEmpty()){
			int p = queue.poll();
			if(prev != p){
				if((long)Math.pow(prev, 2) - sum < 0){
					count += (sum - Math.pow(prev, 2))/prev;
				}
				else if((long)Math.pow(prev, 2) - sum > 0){
					count += sum/prev;
				}
				sum = p;
			}
			else{
				sum += p;
			}
			prev = p;

			//System.out.println(count);
		}
		//System.out.println(sum);
		//System.out.println(prev);
		//System.out.println(count);
		if((long)Math.pow(prev, 2) - sum < 0){
			count += (sum - (long)Math.pow(prev, 2))/prev;
		}
		else if((long)Math.pow(prev, 2) - sum > 0){
			count += sum/prev;
		}

		System.out.println(count);
	}
}