import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		long[][] dig=new long[N-1][3];
		int C=0;
		int S=0;
		int F=0;
		long unko=0;
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<3; j++) {
				dig[i][j]=sc.nextLong();
			}
		}
		for(int i=0; i<N-1; i++) {
			unko=0;
			for(int j=i; j<N-1; j++) {
				if(j==i) {
					unko+=dig[j][1];	//Sを足す
				}
				if(unko<dig[j][1]) {
					unko=dig[j][1];
				}
				unko+=dig[j][0];
				unko=unko+(dig[j][2]-1)/dig[j][2]*dig[j][2];
			}
			System.out.println(unko);
		}
		System.out.println("0");
	}
}