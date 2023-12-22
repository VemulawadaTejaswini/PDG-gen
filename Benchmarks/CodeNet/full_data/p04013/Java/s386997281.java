import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //部分展開法（bit全探索

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N];
        
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }

        long count = 0;
        //{0,1,...,n-1}の部分集合の全探索
        for(int bit = 0; bit < (1 << N); bit++){
            int sum = 0;
            int num = 0;
            for(int i = 0; i < N; i++){
                //「bit >> i」は「bitを左へiビットだけシフトする意。
                if((1 & bit >> i  ) == 1){
                    sum += x[i];
                    num++;
                }
            }
            if(num != 0 && (sum % num == 0) && (sum / num == A)) count++;
        }
        System.out.println(count);
    }   
}
