import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int Q = in.nextInt();
		int[] l=new int[M];
		int[] r=new int[M];
		int[] p=new int[Q];
		int[] q=new int[Q];
		for(int i=0;i<M;i++) {
			l[i]=in.nextInt();
			r[i]=in.nextInt();
		}
		for(int i=0;i<Q;i++) {
			p[i]=in.nextInt();
			q[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<Q;i++) {
			for(int j=0;j<M;j++) {
				if(p[i]<=l[j]&&r[j]<=q[i]) {
					count++;
				}

			}
			System.out.println(count);
			count=0;
		}
	
	}

}
