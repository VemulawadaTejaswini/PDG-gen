import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by btk on 2017/10/13.
 */
public class Main {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       long[] x = new long[n];
       long[] y = new long[n];
       for (int i = 0; i < n; i++) {
           x[i]=sc.nextLong();
           y[i]=sc.nextLong();
       }
       long ret=4123456789123456789l;
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               for (int l = 0; l < n; l++) {
                   long lb=y[l];
                   long ub=1123456789;
                   final long xl=x[i];
                   final long xu=x[j];
                   final long yl=y[l];
                   Function<Long,Integer> calc=(m)->{
                       int sum=0;
                       for (int o = 0; o < n; o++) {
                           if(xl<=x[o]&&x[o]<=xu&&yl<=y[o]&&y[o]<=m){
                               sum++;
                           }
                       }
                       return sum;
                   };
                   if(calc.apply(ub)<k)continue;
                   while(ub-lb>1){
                       long m=(lb+ub)/2;
                       if(calc.apply(m)>=k)ub=m;
                       else lb=m;
                   }
                   ret=Math.min(ret,(xu-xl)*(ub-yl));

               }
           }
       }
       System.out.println(ret);
       sc.close();
   }
}
