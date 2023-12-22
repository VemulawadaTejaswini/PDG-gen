import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int ans = 0;
        int n = in.nextInt();
        int mx=0;
        String t = in.next();
        for (int i =0;i<n;i++){
            if(t.charAt(i)=='D'){
                ans--;
            }
            else {
                ans++;
                mx = Math.max(mx,ans);
            }
        }
        System.out.println(mx);
    }
}