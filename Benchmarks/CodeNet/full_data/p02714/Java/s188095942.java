import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt() ;
        String S = stdIn.next();
        char C1,C2,C3 ;
        int count = 0;

        for (int i = 0; i < a; i++) {
            C1 = S.charAt(i) ;
            for (int j = i+1; j <a; j++) {
                C2 = S.charAt(j);
                for (int k = j+1; k <a; k++) {
                  //  System.out.println(i+" "+j+" "+k);
                    C3 = S.charAt(k);
                    if(C1 == C2 || C2 == C3 || C1 == C3);
                    else if(j-i == k-j ) ;
                    else {
                        count++ ;
                    }
                   // System.out.println("GET " +i+" "+j+" "+k);
                }
            }
        }

        System.out.println(count);
    }
}