import java.util.Scanner;

public class Main {


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main main =new Main();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i]= sc.nextInt();
		}
		long count=0;
		for(int i=0;i<N;i++) {
			for (int j=0;j<=i;j++) {
				b[j]=(b[j]+a[i])%K;
				if(b[j]==i-j+1) {
					count ++;
				}
			}
		}
		System.out.println(count);

	}

}