import java.util.*;
import java.math.BigDecimal;
public class At_coder
{static int c=0;
    public static void main()
    { Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        BigDecimal A, B; 
        double sum_power=0,count=0;
        B  = BigDecimal.valueOf(sum_power); 
        for(int i=1;i<=num;i++){
            count=doublet(i,k);
            double p=Math.pow(2,count)*num;
            A  = BigDecimal.valueOf(1/p);
            //System.out.println(A);
            B=B.add(A);
            c=0;
        }
        System.out.println(B);
    }

    static int doublet(int n,int f){
        if (n<f){
            c=c+1;
            return doublet(2*n,f);}
        else
            return c;}
}

