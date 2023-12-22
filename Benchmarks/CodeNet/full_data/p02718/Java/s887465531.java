import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[]=new int[N+1];
		int sum = 0;
		int choice=0;
		String ansy="Yes";
		String ansn="No";
		for(int i=1;i<=N;i++){
			A[i]=sc.nextInt();
		}

		for(int i=1;i<=N;i++){
			sum=sum+A[i];
		}

		for(int i=1;i<=N;i++){
			if (A[i]>=sum/(4*M)){
				choice=choice+1;
			}
		}
		if (choice>=M) {
				System.out.println(ansy);
		}
		else{
				System.out.println(ansn);
		}
    }
}