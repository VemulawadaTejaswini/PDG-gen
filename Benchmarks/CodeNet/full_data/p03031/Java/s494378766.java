
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] sk = new int[M][];
        for (int i = 0; i < M; i++) {
            int k = sc.nextInt();
            int[] nums = new int[k];
            sk[i] =nums;
            for (int j = 0; j < k; j++) {
                nums[j]= sc.nextInt()-1;
            }
        }
        int[] p = new int[M];
        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
        }

        int ans =0;
        for (int i = 0; i < (1<<N); i++) {// all switch pattern in binary representation 0000000 to 11111111
            boolean flag = true;
            for (int j = 0; j < M; j++) {//Check  i-th light
                int count=0;
                for (int k = 0; k < sk[j].length; k++) {//check for all switch connected
                    int idx = sk[j][k];//switch index
                    int ithSwitch =i>> (N-idx-1);
                    if ( ithSwitch %2 == 1 ) count++;//switch on
                }
                if(count%2 != p[j]){ // check off or even
                    flag=false;
                    break;
                }
            }
            if(flag) ans++;
        }

        System.out.println(ans);


    }
}