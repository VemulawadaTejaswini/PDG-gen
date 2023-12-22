import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] C = new String[H];
        String[] ans = new String[2 * H];

        for(int i=0; i<H; i++){
            C[i] = sc.next();
        }

        for(int i=0; i<2*H; i++){
            ans[i] = "";
            for(int j=0; j<W; j++){
                ans[i] += String.valueOf(C[(i+2)/2-1].charAt(j));
            }
            System.out.println(ans[i]);
        }
    }
}