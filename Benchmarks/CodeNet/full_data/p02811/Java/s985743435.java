import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int k = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        k *= 500;
        if(k >= x) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}