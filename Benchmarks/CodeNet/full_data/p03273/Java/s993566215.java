import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int[][] a=new int[H][W];
        for (int i = 0; i < H; i++) {
            String s=sc.next();
            for (int j = 0; j < W; j++) {
                if(s.charAt(j)=='#')a[i][j]=1;
            }
        }
        int[] t=new int[W];
        for (int i = 0; i < H; i++) {
            int c=0;
            for (int j = 0; j < W; j++) {
                t[j]+=a[i][j];
                c+=a[i][j];
            }
            if(c==0){
                for (int j = 0; j < W; j++) {
                    a[i][j]=2;
                }
            }
        }
        for (int i = 0; i < W; i++) {
            if(t[i]==0){
                for (int j = 0; j < H; j++) {
                    a[j][i]=2;
                }
            }
        }
        for (int i = 0; i <H; i++) {
            int c=0;
            for (int j = 0; j < W; j++) {
                if(a[i][j]==0)out.print(".");
                if(a[i][j]==1)out.print("#");
                c+=a[i][j];
            }
            if(c!=2*W)out.println();
        }
    }
}
