import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int l[] = new int[M];
		int r[] = new int[M];
		int p[] = new int[Q];
		int q[] = new int[Q];
		int counter =0;

		for(int i=0;i<M;++i){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		for (int i=0; i<Q;++i){
			p[i]=sc.nextInt();
			q[i]=sc.nextInt();
		}

		for (int i=0;i<Q;++i){
			counter = 0;
			for (int j=0;j<M;++j){
				if (p[i]<=l[j] && r[j]<=q[i]) ++counter;
			}
			System.out.println(counter);
		}


	}

}