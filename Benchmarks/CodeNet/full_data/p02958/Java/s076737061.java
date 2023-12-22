import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int Array_1[] = new int[N];
		int Array_2[] = new int[N];
		int count = 0;

			for(int k=0 ; k<N ; k++) {
				Array_1[k] = in.nextInt();
				Array_2[k] = Array_1[k];
			}
			Arrays.sort(Array_1);
			for(int k=0 ; k<N ; k++) {
				if(Array_1[k]!=Array_2[k]) {
					count++;
				}
			}
			if(count>2) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
	}

}
