import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args){
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = Math.max(2*a-1,2*b-1);
        ans = Math.max(ans,a+b);
        System.out.println(ans);
    }
}