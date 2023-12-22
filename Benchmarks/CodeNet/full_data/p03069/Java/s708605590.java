
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		String S=sc.next();

		int[] white=new int[N+1];
		int[] black=new int[N+1];

		white[0]=black[0]=0;

		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='.') {
				white[i+1]=white[i]+1;
				black[i+1]=black[i];
			}else {
				white[i+1]=white[i];
				black[i+1]=black[i]+1;
			}
		}

		int ans=N;

		for(int i=1;i<N+1;i++) {
			int temp=white[N-i]+black[i];
			ans=Math.min(ans, temp);
		}

		System.out.println(ans);

		sc.close();
	}

}
