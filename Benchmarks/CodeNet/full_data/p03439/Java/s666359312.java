import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] rec = new String[N+1];
        PrintWriter out = new PrintWriter(System.out);
        out.println(0);
        out.flush();
        String s = sc.next();
        rec[0]=rec[N]=s;
        if(s.equals("Vacant")) System.exit(0);
        int lower = 0, upper = N;
        for(int i=0;i<25;i++){
            int mid = (lower+upper)/2;
            out.println(mid);
            out.flush();
            rec[mid]=sc.next();
            if(rec[mid].equals("Vacant")) System.exit(0);
            if(upper-mid<=1) upper=mid;
            else if(mid-lower<=1) lower = mid;
            else{
                if(rec[mid].equals(rec[lower])){
                    if((mid-lower-1)%2==1) lower=mid;
                    else upper=mid;
                } else{
                    if((mid-lower-1)%2==1) upper=mid;
                    else lower=mid;
                }
            }
        }
    }
}
