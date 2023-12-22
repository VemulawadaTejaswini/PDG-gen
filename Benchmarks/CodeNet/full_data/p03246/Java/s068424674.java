import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();

		int[] KISU=new int[100001];
		int[] GUSU=new int[100001];

		for(int i=0; i<=100000; i++) {
			KISU[i]=0;
			GUSU[i]=0;
		}

		for(int i=0; i<N; i++) {
			if(i%2==0) {
				KISU[sc.nextInt()]++;
			}
			else if(i%2==1) {
				GUSU[sc.nextInt()]++;
			}
		}

		int K_MAX=0;
		int G_MAX=0;
		int K_NUM=0;
		int G_NUM=0;
		int K_2nd=0;
		int G_2nd=0;
		int K_2nu=0;
		int G_2nu=0;

		for(int i=0; i<=100000; i++) {
			if(K_MAX<KISU[i]) {
				K_MAX=KISU[i];
				K_NUM=i;
			}

			if(G_MAX<GUSU[i]) {
				G_MAX=GUSU[i];
				G_NUM=i;
			}
		}
/*
		for(int i=0; i<=100000; i++) {
			if(K_2nd<KISU[i] && KISU[i]<K_MAX) {
				K_2nd=KISU[i];
			}

			if(G_2nd<GUSU[i] && GUSU[i]<G_MAX) {
				G_2nd=GUSU[i];
			}
		}*/

		Arrays.sort(KISU);
		Arrays.sort(GUSU);
		K_2nd=KISU[99998];
		G_2nd=GUSU[99998];

		if(K_NUM!=G_NUM) {
			System.out.println(N-K_MAX-G_MAX);
		}
		else if(K_NUM==G_NUM) {
			int[][] mat=new int[2][2];
			mat[0][0]=K_MAX;
			mat[0][1]=K_2nd;
			mat[1][0]=G_MAX;
			mat[1][1]=G_2nd;

			System.out.println(Math.min(N-mat[0][0]-mat[1][1], N-mat[0][1]-mat[1][0]));
		}
	}
}
