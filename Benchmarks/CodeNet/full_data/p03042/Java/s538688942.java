import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int S;
        int M,N;
        Scanner sc = new Scanner(System.in);

        S = sc.nextInt();
        M = S % 100;
        S /= 100;
        N = S;
        
        if(M > 12) {
            if (N == 00) {
                System.out.println("NA");
               
            }else {
            	System.out.println("MMYY");
            }
        }else if(N > 12) {
          if (M == 00) {
              System.out.println("NA");
          }else {
          	System.out.println("YYMM");
          }
        }else { 
          System.out.println("AMBIGUOUS");
        }
    }
}