import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] d = new Integer[N];
		for(int i = 0;i < N;i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d,Collections.reverseOrder());
		int max = d[0];
		int count = 1;
		for(int k = 1;k < N;k++) {
			if(max > d[k]) {
				max = d[k];
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
