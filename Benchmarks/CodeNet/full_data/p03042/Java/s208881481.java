import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String S = sc.next();
        sc.close();

        int a = Integer.parseInt(S.substring(0, 2));
        String A = S.substring(0, 2);
        
        int b = Integer.parseInt(S.substring(2, 4));
        String B = S.substring(2, 4);
        
        int p = 0;
        int q = 0;
        if(A.equals("00")||a >= 13){
            p = 1;
        }
        if(B.equals("00")||b >= 13){
            q = 1;
        }

        if(p == 0 && q == 0){
            System.out.println("AMBIGUOUS");
        }
        else if(p == 1 && q == 0){
            System.out.println("YYMM");
        }
        else if(p == 0 && q == 1){
            System.out.println("MMYY");
        }
        else{
            System.out.println("NA");
        }
    }
}
