import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int max=1;
		for(int i=0; i<N; i++) {
			max*=2;
		}
		max--;
		if(K>max) {
			System.out.println(-1);
		}
		else {
			if(N==0) {
				System.out.println("0 0");
			}
			else if(N==1) {
				if(K==0) {
					System.out.println("0 0 1 1");
				}
				else {
					System.out.print(-1);
				}
			}
			else {
				if(max==K) {
					StringBuffer sb=new StringBuffer();
					sb.append(K+" ");
					for(int i=max; i>=0; i--) {
						if(i!=K) {
							sb.append(i+" ");
						}
					}
					sb.append(K+" ");
					for(int i=0; i<max; i++) {
						if(i!=K) {
							sb.append(i+" ");
						}
					}
					System.out.println(sb.toString());
				}
				else {
					StringBuffer sb=new StringBuffer();
					sb.append(K+" ");
					for(int i=max; i>=0; i--) {
						if(i!=K) {
							sb.append(i+" ");
						}
					}
					sb.append(K+" ");
					for(int i=0; i<max; i++) {
						if(i!=K) {
							sb.append(i+" ");
						}
					}
					sb.append(max);
					System.out.println(sb.toString());
				}
			}
		}
	}
}