import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			int[]a = new int[N-1];
			int[]b = new int[N-1];

			int []c = new int[N+1];
			int[]hen = new int[N-1];
			ArrayList<Set<Integer>> are = new ArrayList<Set<Integer>>();

			for(int i = 0;i<N;i++) {
				Set<Integer>set = new TreeSet<Integer>();
				are.add(set);
			}

			for(int i = 0;i<N-1;i++) {
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				c[a[i]]++;
				c[b[i]]++;
			}

			int max = 0;
			for(int i = 1;i<=N;i++) {
				max = Math.max(max, c[i]);
			}

			int count = 1;

			System.out.println(max);

			for(int i = 0;i<N-1;i++) {

				boolean A = are.get(a[i]-1).contains(count);
				boolean B= are.get(b[i]-1).contains(count);

				if(A||B) {
					if(count==max)count = 1;
					else count++;
					are.get(a[i]-1).add(count);
					are.get(b[i]-1).add(count);

					System.out.println(count);


				}else{
					System.out.println(count);
					are.get(a[i]-1).add(count);
					are.get(b[i]-1).add(count);
				}

			}







		}


	}



}
