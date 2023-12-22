import java.util.*;


public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int N = sc.nextInt();

        if(D == 0){
        	if(N == 100){
        		System.out.println(N + 1);
        	}else{
        		System.out.println(N);
        	}
        }else if(D > 0){
        	long ans = (long)Math.pow(100 * 1.0, D) * N;
        	if(N == 100){
        		System.out.println(ans + 1);
        	}else{
        		System.out.println(ans);
        	}
        }

	}
}