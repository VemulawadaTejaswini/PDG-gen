import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		long[] a = new long[k];
		for(int i=0;i<k;i++) {
			a[i] = in.nextLong();
		}
		long min = 0;
		long max = 0;
		boolean possible = true;
		if(a[k-1]==2) {
			min = 2;
			max = 2;
			for(int i=k-2;i>=0;i--) {
				max = max*2-1;
				if(max<a[i]) {
					possible = false;
					break;
				}
				min = min%a[i]==0?min:min - min%a[i] + a[i];
				max = max - max%a[i];
			}
			max = max + a[0]-1;
		}else {
			possible = false;
		}
		
		if(possible) System.out.println(min + " " + max);
		else System.out.println(-1);
		in.close();
	}

}
