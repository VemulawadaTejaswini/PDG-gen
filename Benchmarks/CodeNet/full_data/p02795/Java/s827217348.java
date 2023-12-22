import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        int ans = H+W;
        for(int h=0; h<=H; h++) for(int w=0; w<=W; w++) if(H*W-(H-h)*(W-w)>=N) ans = Math.min(ans, h+w);
        System.out.println(ans);
    }


}
