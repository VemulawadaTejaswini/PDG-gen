import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[3 * N];
		for(int i = 0; i < 3 * N; i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = Integer.MIN_VALUE;
		for(int k = N; k <= 2 * N; k++) {
			int max = 0;
			Queue<Integer> queue1 = new PriorityQueue<>(k, new MyComparator());
			for(int i = 0; i < k; i++) {
				queue1.add(a[i]);
			}
			int temp1 = 0;
			for(int i = 0; i < N; i++) {
				temp1 += queue1.poll();
			}
			max = Math.max(max, temp1);
			
			int min = Integer.MAX_VALUE;
			Queue<Integer> queue2 = new PriorityQueue<>();
			for(int i = k ; i < 3 * N; i++) {
				queue2.add(a[i]);
			}
			int temp2 = 0;
			for(int i = 0; i < N; i++) {
				temp2 += queue2.poll();
			}
			min = Math.min(min, temp2);
			ans = Math.max(ans, max - min);
		}
		System.out.println(ans);
	}
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
         
        int num1 = (int)obj1;
        int num2 = (int)obj2;
         
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}