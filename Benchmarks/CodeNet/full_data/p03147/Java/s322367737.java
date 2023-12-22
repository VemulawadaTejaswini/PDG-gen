import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String argds[]) {
      	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int prev = sc.nextInt();
        for(int i=1; i<n; i++) {
        	int curr = sc.nextInt();
        	if(prev > curr)
        		ans+=prev-curr;
        	if(i==n-1)
        		ans+=curr;
        	prev = curr;
        }
        System.out.println(ans);
    }
}