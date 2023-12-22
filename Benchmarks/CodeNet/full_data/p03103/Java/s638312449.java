import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer[] A = new Integer[N];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (map.containsKey(A[i])) map.put(A[i],map.get(A[i])+sc.nextInt());
			else map.put(A[i], sc.nextInt());
		}
		Arrays.sort(A);
		long ret = 0;
		long sum = 0;
		int count = 0;
		while(sum<M) {
			int a = A[count];
			int b = map.get(a);
			if(sum + b >= M) {
				ret+= (M-sum)*a;
				break;
			}
			else {
				ret += a*b;
				sum += b;
				count++;
				map.put(a,0);
			}
		}

		System.out.println(ret);
	}
}
