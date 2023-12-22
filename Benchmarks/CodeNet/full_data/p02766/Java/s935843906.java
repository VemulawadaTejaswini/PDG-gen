import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=30;i>=0;i--){
		    if((N / Math.pow(K,i)) >= 1){
			System.out.print(i+1);
			break;
		    }
		}
	}
}
