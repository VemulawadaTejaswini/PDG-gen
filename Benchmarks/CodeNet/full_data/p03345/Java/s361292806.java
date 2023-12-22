import java.util.*;
import java.util.Scanner;
import java.math.BigDecimal;
class Main{
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        BigDecimal A=stdIn.nextBigDecimal();
        BigDecimal B=stdIn.nextBigDecimal();
        BigDecimal C=stdIn.nextBigDecimal();
        BigDecimal K=stdIn.nextBigDecimal();


        BigDecimal cnt=new BigDecimal(0);
        while(true){
            if(cnt.compareTo(K)==0)break;
            BigDecimal tta=BigDecimal.ZERO;
            BigDecimal ttb=BigDecimal.ZERO;
            BigDecimal ttc=BigDecimal.ZERO;
            
            tta=tta.add(B);
            tta=tta.add(C);
            ttb=ttb.add(A);
            ttb=ttb.add(C);
            ttc=ttc.add(A);
            ttc=ttc.add(B);

            A=BigDecimal.ZERO;
            B=BigDecimal.ZERO;
            C=BigDecimal.ZERO;
            A=A.add(tta);
            B=B.add(ttb);
            C=C.add(ttc);

            // System.out.println(cnt.intValue());
            cnt=cnt.add(BigDecimal.ONE);
        }
        BigDecimal tmp=A.subtract(B);
        BigDecimal ttt=new BigDecimal("1000000000000000000");
        if(tmp.abs().compareTo(ttt)==1){
            System.out.println("Unfair");
        }else{
            System.out.println(tmp.longValue());
        }
        
    }
}