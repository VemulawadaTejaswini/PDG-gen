
import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
import static java.lang.String.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;

        long k = parseLong(in.readLine());
        
        if(k==0) System.out.println("2\n1 1");
        else if(k<=50) {
            System.out.println(k);
            for(int i=0; i<k; i++) {
                if(i>0) System.out.print(" ");
                System.out.print(k);
            }
            System.out.println("");
        } else {
            long n = 50;
            k -= 49;
            
            System.out.println(n);
            System.out.print(k*n);
            for(int i=1; i<n; i++)
                System.out.print(" 0");
            System.out.println("");
        }
    }
}
