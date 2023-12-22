import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();

        int N = sc.nextInt();

        int ans=0;
        for(int red=0; red<=N/R; red++) for(int green=0; green<=N/G; green++){
            if(N-R*red-G*green>=0 && (N-R*red-G*green)%B==0){
                ans++;
            }
        }
        System.out.println(ans);

    }
}