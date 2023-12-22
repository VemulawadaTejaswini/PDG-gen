import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long x=Long.parseLong(st.nextToken());
        long sum=(n-1)*3;
        if(n%2!=0){
            System.out.println(sum);
        }else{
            if(x>n/2){
                System.out.println(sum-3*(x-n/2));
            }else{
                System.out.println(sum-3*x);
            }
        }
    }
}
