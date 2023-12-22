import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>(N, Collections.reverseOrder());
		for(int i=0; i<N; i++){
		    int num = sc.nextInt();
		    queue.add(num);
		}
		
		for(int i=0; i<M; i++){
		    int t = queue.peek(); 
		    queue.remove();
            queue.add(t/2);
		}
		int ans=0;
		while(!queue.isEmpty()==true){
		    ans+=queue.peek();
		    queue.remove();
		}
		System.out.println(ans);
	}
}