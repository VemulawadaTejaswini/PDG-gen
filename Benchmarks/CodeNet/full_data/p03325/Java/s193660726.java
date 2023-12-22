import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int ans = 0;

    private static void rec(int[] a) {

        boolean eNumExist = false;
        int index = -1;
        int max = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                eNumExist = true;
                if(max < a[i]){
                  max = a[i];
                  index = i;
                }
            }
        }

        if (eNumExist)
        {
            ans++;
            a[index] = a[index] / 2;
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