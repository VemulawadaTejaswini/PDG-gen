import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] bbnwa=new int[N+1];
		bbnwa[0]=0;

		for(int i=1; i<=N; i++) {
			bbnwa[i]=bbnwa[i-1]+sc.nextInt();
		}

		Arrays.sort(bbnwa);

		long wa=0;

		int tmpwa=0;
		int kasanari=0;

		kasanari=1;
		tmpwa=bbnwa[0];
		for(int i=1; i<=N; i++) {
			if(tmpwa!=bbnwa[i]) {
				wa+=kasanari*(kasanari-1)/2;
				kasanari=1;
				tmpwa=bbnwa[i];
			}
			else {
				kasanari++;
			}
		}

		wa+=kasanari*(kasanari-1)/2;
		System.out.println(wa);
	}
}