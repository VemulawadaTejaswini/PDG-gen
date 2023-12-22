import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}

		int cnt=0;

		boolean waru2=true;
		for(int i=0; i<N; i++) {
			waru2=true;
			while(waru2==true) {
				if((a[i]/2)*2==a[i]) {
					a[i]/=2;
					cnt++;
					//そのまま
				}
				else if((a[i]/2)*2!=a[i]) {
					waru2=false;
				}
			}
		}
		System.out.println(cnt);
	}
}