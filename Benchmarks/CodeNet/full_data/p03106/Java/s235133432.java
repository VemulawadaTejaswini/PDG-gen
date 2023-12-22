import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A,B,K,cnt;

		A=sc.nextInt();
		B=sc.nextInt();
		K=sc.nextInt();
		cnt=0;
		int i=0;
		
		 while(cnt<K) {
			 i++;
			 if(A%i==0 &&B%i==0) {
				cnt++;
			}
			 
		}

		System.out.println(i);
	}
}
