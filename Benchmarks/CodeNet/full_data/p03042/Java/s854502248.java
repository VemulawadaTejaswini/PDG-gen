import java.util.*;
import java.lang.*;

public class Main {
    static boolean canBeMonth(int m){
        return m>0 && m<=12;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int A = Integer.valueOf(S.substring(0,2));
        int B = Integer.valueOf(S.substring(2,4));

        if(canBeMonth(A)){
            if(canBeMonth(B)) System.out.println("AMBIGUOUS");
            else System.out.println("MMYY");
        }else{
            if(canBeMonth(B)) System.out.println("YYMM");
            else System.out.println("NA");
        }

    }
}
