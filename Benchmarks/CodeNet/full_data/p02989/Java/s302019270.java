import java.util.*;
import java.awt.*;

class Main {

    private static Scanner sc = new Scanner(System.in);

    //ソート Arrays.sort(配列名);
    //逆順ソート Arrays.sort(配列名,  Collections.reverseOrder());


    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        int ans=0;

        for(int i = 0;i < n; i++){
            d[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(d);
        ans = d[n/2]-d[n/2-1];

        System.out.println(ans);
    }
}
