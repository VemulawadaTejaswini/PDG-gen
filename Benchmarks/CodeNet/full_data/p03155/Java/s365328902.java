import java.util.*;
import java.io.*;
 
import static java.lang.System.in;
 
public class Main {
    static long mod = 1000000000+7;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt(), w = sc.nextInt();
        int ans = (n-h+1)*(n-w+1);
        System.out.println(ans);
    }
}