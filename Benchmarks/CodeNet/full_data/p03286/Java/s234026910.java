import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N;
        String ans = "";
        while(n != 0){
            if(n % 2 == 0){
                ans = "0" + ans;
                n /= -2;
            }else{
                ans = "1" + ans;
                n = (n-1) / (-2);
            }
        }
        if(N == 0){
            System.out.println("0");
        }else{
            System.out.println(ans);
        }
    }
}
