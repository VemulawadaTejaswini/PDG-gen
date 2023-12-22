import java.util.*;
public class saini{
public static void main(String arg[]){
int A, B, C;
Scanner sc=new Scanner(System.in) ;
A=sc.nextInt() ;
B=sc.nextInt() ;
C=sc.nextInt() ;
if((A==B && B != C) || (A==C && A != C) ||(B==C && B != A) ) 
    System.out.println("No") ;
else
 System.out.println("Yes") ;
}
}