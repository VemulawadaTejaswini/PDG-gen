import java.util.Scanner;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       BigInteger a = sc.nextBigInteger();
       BigInteger b = sc.nextBigInteger();
       int result = a.compareTo(b); //compareTo
       if(result==1) {
       System.out.println("GREATER");
       }
       else if (result== -1) {
       System.out.println("LESS");
       }
       else {
       System.out.println("EQUALS");
       }
       
 }
 }          