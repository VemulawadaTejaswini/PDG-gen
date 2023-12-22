import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
//        out.flush();
        System.out.println(main.solve());
    }
    long solve() throws IOException{
        int k = sc.nextInt();
        long ans = 0;
        for(int a=1;a<=k;a++){
            for(int b=1;b<=k;b++){
                for(int c=1;c<=k;c++){
                    ans += gcd(gcd(a,b),c);
                }
            }
        }
        return ans;
    }
    int gcd(int a, int b){
        if(a<b){
            int c = a; a=b;b=c;
        }
        while(a%b!=0){
            int c = b; b=a%b;a=c;
        }
        return b;
    }
}

