import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        int ans = 1;
        for(int i = 1; i < n; i++){
            if(i * i <= n) ans = i * i;
            else break;
        }
        out.println(ans);
        out.flush();
        sc.close();
    }
}