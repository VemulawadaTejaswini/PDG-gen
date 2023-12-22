



import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
		long time=0;
		int[] line=new int[N];
		for(int i=0; i<N; i++) {
			line[i]=sc.nextInt();
		}
		Arrays.sort(line);

		for(int i=0; i<N-1; i++) {
			time+=Math.min(line[i+1]-line[i], T);
		}
		time+=T;
		System.out.println(time);
	}
}