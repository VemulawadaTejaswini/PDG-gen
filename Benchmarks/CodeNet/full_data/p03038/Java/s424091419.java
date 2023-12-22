import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();

		long[] card=new long[N];

		for(int i=0;i<N;i++){
			card[i]=sc.nextLong();
		}

		Arrays.sort(card);

		for(int i=0;i<M;i++){
			int B=sc.nextInt();
			long C=sc.nextLong();

			int count=0;
			for(int j=0;j<N;j++){

				count++;

				if(card[j]>C) break;

				card[j]=C;

				if(count==B) break;

			}

			Arrays.sort(card);
		}

		long ans=0;

		for(int i=0;i<N;i++) ans+=card[i];

		System.out.println(ans);

		sc.close();
	}

}
