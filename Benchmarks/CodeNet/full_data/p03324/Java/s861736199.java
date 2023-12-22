import java.util.*;
import static java.lang.System.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int cnt = 1;
        double ans = 0;
        for(int i=1;i<=N;i++){
            ans = (Math.pow(100,D)) * i;
        }
        if (D == 0) {
            ans = N;
        }
        int anss = (int) ans;
        out.print(anss);
        
        
        
        
       
    }
}
