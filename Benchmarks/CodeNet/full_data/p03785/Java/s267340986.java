import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			int N = scan.nextInt();
			long C = scan.nextLong();
			long K = scan.nextLong();
			long[]T = new long[N];
			for(int i = 0;i<N;i++) {
				T[i] = scan.nextLong();
			}
			Arrays.sort(T);


			long count = 0;
			long num = 0;
			long hani = 0;
			int ok = 0;
			for(int i = 0;i<N;i++) {
				if(ok==0) {
					hani = T[i];
					ok=1;
				}

				if(hani<=T[i]&&T[i]<=hani+K) {
					num++;

					if(num==C) {
						count++;
						num=0;
						ok=0;
						//if(i==N-1)count++;
					}else {
						if(i==N-1)count++;
					}

				}else {
					count++;
					hani = T[i];
					num=1;
					ok=1;

					if(i==N-1)count++;
				}




			}


			System.out.println(count);



		}


	}


}
