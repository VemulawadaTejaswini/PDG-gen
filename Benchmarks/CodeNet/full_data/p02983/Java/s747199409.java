import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long L = scan.nextInt();
        long R = scan.nextInt();
        long mulnum = 0;
        long modmin = 2018;
      	long [] skip = new long [2019];
      	for(long i=0;i<2019;i++){
        	skip[(int)i] = 0;
        }
        for (long i = L; i < R; i++) {
            for (long j = i+1; j <= R; j++) {              
              if(skip[(int)mulnum]!=0){
                	continue;
                }
              	mulnum = i * j;
                mulnum %= 2019;                
                if (mulnum < modmin) {
                    modmin = mulnum;
                }else{
                	skip[(int)mulnum] = 1;
                }
            }
        }
        System.out.println(modmin);
    }
}