import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long ways = (x / 11)*2;
        long left = x % 11;
        if(left <= 6)++ways;
        else ways += 2;
        System.out.println(ways);
    }
}
