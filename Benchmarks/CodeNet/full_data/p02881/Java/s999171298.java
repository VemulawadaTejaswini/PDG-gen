import java.util.Scanner;

public class Main{
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     long num1 = scan.nextLong();
     long answer = 0;
     long i, j;
     long gcd = 1;//最大公約数のこと
     long most_near_mass = num1;
     
     long half = (long)( num1/2 );
     
     if( num1 % 2 == 0 ){
       for( i=2 ; i < (int)( num1/2 ) ; i += 2 ){
         
         if( most_near_mass > (i - 1) + ( (num1 / i) - 1) && num1 % i == 0){
           most_near_mass = (i - 1) + ( (num1 / i) - 1);
           gcd = i;
         }
       }
     }
     
     else{
      for( i=1 ; i < (int)( num1/2 ) ; i += 2 ){
        
         if( most_near_mass > (i - 1) + ( (num1 / i) - 1) && num1 % i == 0){
           most_near_mass = (i - 1) + ( (num1 / i) - 1);
           gcd = i;
         }
       }
     }
     
     if( gcd == 0 )gcd = num1;
     
     answer = (gcd - 1) + ( (num1 / gcd) - 1);
     System.out.println(answer);
   }
}