import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K= sc.nextInt();
		
		for(int i =1;i<=N;i++){
			if(N==1){
				N=N*K;
				break;
			}
			N=N*(K-1);
		}
		System.out.println(N);
	}

}
