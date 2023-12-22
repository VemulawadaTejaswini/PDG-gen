import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        long B[] = new long[100001];

        // 配列を0で満たす
        Arrays.fill(B,0);

        for(int cnt = 0;cnt < N; cnt++){
        	int a = in.nextInt();
        	int b = in.nextInt();
        	B[a] += b;
        }
        in.close();
        for(int cnt = 0; cnt < 100001; cnt++){
        	if(K <= B[cnt]){
        		System.out.println(cnt);
        		break;
        	}
        	else{
        		K -= B[cnt];
        	}
        }

    }



}