import java.util.Scanner;

public class Main{
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     long num1 = scan.nextLong();
     long answer = 0;
     long i, j;
     long gcd = 0;//最大公約数のこと
     
     for( i=1 ; i < (int)( num1/2 ) ; i++ ){
         if( num1 % i == 0 && i > gcd  ){
           gcd = i;
         }
     }
     
     if( gcd == 0 )gcd = num1;
     
     answer = (gcd - 1) + ( (num1 / gcd) - 1);
     System.out.println(answer);
   }
}