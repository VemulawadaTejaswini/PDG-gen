import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char S[] = new char[n];
		S = sc.next().toCharArray();

		int a[] = new int[n];
		for(int i=0; i<n; i++) a[i] = -1;
		//0=羊 1=狼
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				a[n-1]=i;
				a[0]=j;
				for(int k=0; k<n-1; k++) {
					char c = S[k];
					if(c=='o') {
						if(a[k]==0) {
							a[k+1]=a[(k-1+n)%n];
						}else {
							a[k+1]=(a[(k-1+n)%n]+1)%2;
						}
					}else {
						if(a[k]==0) {
							a[k+1]=(a[(k-1+n)%n]+1)%2;
						}else {
							a[k+1]=a[(k-1+n)%n];
						}
					}
				}
				boolean ok = true;
				for(int k=0; k<n; k++) {
					if(S[k]=='o') {
						if(a[k]==0 && a[(k-1+n)%n]!=a[(k+1)%n]) ok=false;
						if(a[k]==1 && a[(k-1+n)%n]==a[(k+1)%n]) ok=false;
					}else {
						if(a[k]==0 && a[(k-1+n)%n]==a[(k+1)%n]) ok=false;
						if(a[k]==1 && a[(k-1+n)%n]!=a[(k+1)%n]) ok=false;
					}
				}
				if(ok) {
					p(a);
					sc.close();
					return;
				}
			}
		}
		System.out.println(-1);
		sc.close();
	}

	private void p(int a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				System.out.print('S');
			}else {
				System.out.print('W');
			}
		}
		System.out.println();
	}
}
