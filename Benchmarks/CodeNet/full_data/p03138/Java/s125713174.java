import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String[] nm = sc.nextLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            long k = Long.parseLong(nm[1]);
            
            String[] alist = sc.nextLine().split(" ");
            //Convert to binary string
            long[] aary = new long[n];
            for(int i=0;i<n;i++){
                aary[i] = Long.parseLong(alist[i]);
            }
            
            //Convert to binary string
            String[] bsary = new String[n];
            int maxbslen = 0;
            for(int i=0;i<n;i++){
                bsary[i] = Long.toBinaryString(aary[i]);
                maxbslen = Math.max(maxbslen,bsary[i].length());
            }
            
            //Count each bit in binary string
            long bitcount [] = new long[maxbslen];
            for(String bs:bsary){
                for(int j=bs.length() - 1; j >= 0;j--){
                    if(bs.charAt(j)=='1'){
                        bitcount[bs.length() - 1 - j]++;
                    }
                }
            }
            
            //Calculate digits of x in binary
            String kbstr = Long.toBinaryString(k);
            int kdigit = Long.toBinaryString(k).length();
            
            //Calculate x
            long x = 0;
            for(int i = kdigit - 1; i >= 0; i--){
                long xif1 = x + (long)Math.pow(2,i);
                if(kbstr.charAt(i) == '1'){
                    if(i >= bitcount.length){
                        x = xif1;                 
                    }else{
                        if(bitcount[i] <= n/2){
                            x = xif1;
                        }
                    }
                }else{
                    //x[i] must be 0.
                    continue;
                }
            }
            
            //Calculate f
            long f = 0;
            for(long a:aary){
                f += x^a;
            }
            System.out.println(f);
		}
    }
}