import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int ama=sc.nextInt();

		long iti=0;
		long zer=0;

		int tmp=0;
		for(int i=0; i<N; i++) {
			tmp=sc.nextInt();
			if(tmp%2==0) {
				zer++;
			}
			else {
				iti++;
			}
		}

		long[] iti_tor=new long[(int)iti+1];
		long[] zer_tor=new long[(int)zer+1];

		for(int i=0; i<=iti; i++) {
			iti_tor[i]=Combi((int)iti,i);
		}

		for(int i=0; i<=zer; i++) {
			zer_tor[i]=Combi((int)zer,i);
		}

		long kisu_wa_k=0;
		long kisu_wa_g=0;

		for(int i=1; i<=iti; i+=2) {
			kisu_wa_k+=iti_tor[i];
		}

		for(int i=0; i<=iti; i+=2) {
			kisu_wa_g+=iti_tor[i];
		}

		long gw=0;

		for(int i=0; i<=zer; i++) {
			gw+=zer_tor[i];
		}
		if(ama==1) {
			System.out.println(kisu_wa_k*gw);
		}
		else {
			System.out.println(kisu_wa_g*gw);
		}
	}

	public static long Combi(int n,int r) {		// nCr
		if(r==0 || r==n) return 1L;

		if(r>n-r) {
			r=n-r;
		}

		int[] bunsi=new int[r];
		int[] bunbo=new int[r];

		for(int k=0; k<r; k++) {
			bunsi[k]=n-r+k+1;
			bunbo[k]=k+1;
		}

		for(int p=2; p<=r; p++) {
			int pivot=bunbo[p-1];
			if(pivot>1) {
				int offset=(n-r)%p;
				for(int k=p-1; k<r; k+=p) {
					bunsi[k-offset]/=pivot;
					bunbo[k]/=pivot;
				}
			}
		}

		long kotae=1;

		for(int k=0; k<r; k++) {
			if(bunsi[k]>1) {
				kotae*=bunsi[k];
			}
		}

		return kotae;
	}
}