import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int M = io.nextInt();
		String[] a = new String[N];
		String[] b = new String[M];
		for(int i=0;i<N;i++){
			a[i] = io.next();
		}
		for (int j = 0; j < M; j++) {
			b[j] = io.next();
		}
		
		for(int i=0; i<N-M+1;i++){
			loop:for(int j=0;j<N-M+1;j++){
				for(int k=0;k<M;k++){
					for(int l=0;l<M;l++){
						if(a[i+k].charAt(j+l) !=
								b[k].charAt(l))
							continue loop;
					}
				}
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}	