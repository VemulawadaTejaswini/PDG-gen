import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        long n = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);
        long c = (n-2)*(m-2);
        if(n==1) {
            c = m-2;
        } else if(m==1) {
            c = n-2;
        } else if(n==2 || m==2) c = 0;
        System.out.println(c<0?0:c);
    }
}