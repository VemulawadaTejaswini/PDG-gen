import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      long a=0,b=0,c=0,d=0;
      Scanner scanner = new Scanner(System.in);
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();
      d = scanner.nextInt();
      scanner.close();

      long numC = (b-a+1)/c;
      if ((b-a+1)%c != 0) {
         long flag = 0;
         for (long i=a; i<a+c-1; i++) {
            if(i%c==0){
               flag = 1;
               break;
            }
         }
         if (flag == 1) {
            numC++;
         }
      }
      //System.out.prlongln(numC);
      long numD = (b-a+1)/d;
      if ((b-a+1)%d != 0) {
         long flag = 0;
         for (long i=a; i<a+d-1; i++) {
            if(i%d==0){
               flag = 1;
               break;
            }
         }
         if (flag == 1) {
            numD++;
         }
      }
      //System.out.prlongln(numD);
      long Lcd = lcm(c,d);
      long numC_D = (b-a+1)/Lcd;
      //System.out.prlongln(numC_D);
      if ((b-a+1)%Lcd != 0) {
         long flag = 0;
         for (long i=a; i<a+Lcd-1; i++) {
            if(i%Lcd==0){
               flag = 1;
               break;
            }
         }
         if (flag == 1) {
            numC_D++;
         }
      }
      //System.out.prlongln(numC_D);
      System.out.println((b-a+1)-(numC+numD-numC_D));
   }


   static long lcm (long a, long b) {
   	long temp;
   	long c = a;
   	c *= b;
   	while((temp = a%b)!=0) {
   		a = b;
   		b = temp;
   	}
   	return (long)(c/b);
   }

}
