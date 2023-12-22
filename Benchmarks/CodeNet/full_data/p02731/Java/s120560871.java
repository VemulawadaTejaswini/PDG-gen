import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int l=kbd.nextInt();

   double m;
   double max=0;

     for(double i=0;i<2*l/3;i+=0.01){
     for(double p=0;p<l-i;p+=0.01){
       m=i*p*(l-i-p);
       if(m>max){
         max=m;
       }
     }
   }

      System.out.printf("%.6f\n",max);
}
}
