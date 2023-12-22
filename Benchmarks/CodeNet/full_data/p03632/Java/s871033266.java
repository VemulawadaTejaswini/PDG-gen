import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt(),ans;
            if(b >= c){
                if(b <= d) ans = b - c;
                else ans = (b - c) - (b - d);   
            }else ans = 0;
            System.out.println(ans);
        }    
}