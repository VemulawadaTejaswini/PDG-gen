import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long L = scan.nextInt();
        long R = scan.nextInt();
        long mulnum = 0;
        long modmin = 2018;
        for (long i = L; i < R; i++) {
            for (long j = i + 1; j <= R; j++) {
                mulnum = i * j;
                mulnum %= 2019;
              	if(mulnum==0){
                	break;
                }
                if (mulnum < modmin) {
                    modmin = mulnum;
                }
            }
        }
        System.out.println(modmin);
    }
}