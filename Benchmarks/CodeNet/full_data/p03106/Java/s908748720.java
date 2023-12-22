import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    	Scanner sc = new Scanner(System.in);

    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int K = sc.nextInt();

    	int cnt = 0;

    	int small = Math.min(A, B);
    	for(int i=small; i>=1; i--) {

    		if(A % i == 0 && B % i == 0){
    			if(++cnt == K) {
    				System.out.println(i);
    				return;
    			}
    		}
    	}
    }
}