import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		Long N = sc.nextLong();
		int K = 1;
		
		int i;
		for(i=1;i<N;i++){
		K=1*K*i;
		}
		int z=(int) Math.pow(10, 9);
		K=K%(z+7);
		System.out.println(K);
	

	}
}