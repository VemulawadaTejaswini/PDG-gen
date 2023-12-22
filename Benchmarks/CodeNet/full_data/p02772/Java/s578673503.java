import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solve());
    }
    String solve() throws IOException {
        boolean flag = true;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a%2==0){
                flag &= (a%3==0)||(a%5==0);
            }
        }
        return flag?"APPROVED":"DENIED";
    }
}

