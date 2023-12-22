import java.util.*;
import java.awt.*;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        int ans=0;
        int k = 0;
        int max = 0;
        int min =100000;

        for(int i = 0;i < n; i++){
            d[i] = Integer.parseInt(sc.next());
            max = Math.max(max,d[i]);
            min = Math.min(min,d[i]);
        }
        for(int i = min; i < max; i++){
            k = i;
            int abc = 0;
            int arc = 0;
            for(int l = 0; l < n; l++){
                if(d[l] < k){
                    abc++;
                }else{
                    arc++;
                }
            }
            if(abc == arc){
                ans++;
            }
        }


        System.out.println(ans);
    }
}
