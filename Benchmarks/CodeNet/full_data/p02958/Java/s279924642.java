import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p[] = new int[N];
		//int cnt_1=0;
		int cnt_2=0;

		for(int i=0;i<N;i++) {
			p[i]= sc.nextInt();

			for(int k=0;k<N-1;k++) {
				if(p[k+1]-p[k]==1&&p[k+1]-p[k]==-1)cnt_2++;
			}
		}




		if(cnt_2<N-2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}