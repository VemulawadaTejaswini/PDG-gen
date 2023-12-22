import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
        int ans = Math.min(p+q,Math.min(p+r,q+r));
        System.out.println(ans);
    }
}

