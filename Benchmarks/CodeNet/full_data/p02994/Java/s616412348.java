import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int L = sc.nextInt();
        int[] ans = new int[d];
        int[] sum = new int[d];
        int o =0;
        for(int i =1; i <= d; i++){
            ans[i-1] = L + i -1;
        }
//        for(int k =0; k < d; k++){
//            sum[k] = abs(ans[k]);
//        }
        Arrays.sort(sum);
        for(int j =0; j < d; j++){
            o += ans[j];
        }
if(L < 0&& abs(L) < d){
    System.out.println(o);
}else if(L < 0 && abs(L)> d){
    System.out.println(o + abs(ans[d-1]));
}else if(L >= 0){
    System.out.println(o - ans[0]);

}

            }
        }
