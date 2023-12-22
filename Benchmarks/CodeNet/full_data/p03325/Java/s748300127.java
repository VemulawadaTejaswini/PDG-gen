import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int ans = 0;

    private static void rec(int[] a) {

        boolean maxENumExist = false;
        int index = -1;


        int max = 0;
        for (int i = a.length - 1; 0 <= i; i--) {

            if (a[i] % 2 == 0) {
                
                maxENumExist = true;
                
                if(max < a[i]){
                  max = a[i];
                  index = i;
                }
            }
        }


        if (maxENumExist) 
        {
            ans++;
            
            a[index] = a[index] / 2;
            
            for (int i = a.length - 1; 0 <= i; i--) {//最大値の偶数以外に3をかける
                if (i != index) a[i] = 3 * a[i];
            }
            
            rec(a);
            
        }else{

            return; //偶数が1つもみつからなかったら、そこで終了
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(scan.next());
        }

        rec(a);

        System.out.println(ans);
    }
}