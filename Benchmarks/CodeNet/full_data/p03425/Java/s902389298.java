import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    static int mod=1000000007;
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long[] c=new long[5];
        for (int i = 0; i < n; i++) {
            char p=sc.next().charAt(0);
            switch (p){
                case 'M':c[0]++;break;
                case 'A':c[1]++;break;
                case 'R':c[2]++;break;
                case 'C':c[3]++;break;
                case 'H':c[4]++;break;
                default:break;
            }
        }
        long ans=0;
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 4; j++) {
                for (int k = j+1; k < 5; k++) {
                    ans+=c[i]*c[j]*c[k];
                }
            }
        }
        out.println(ans);
    }
}