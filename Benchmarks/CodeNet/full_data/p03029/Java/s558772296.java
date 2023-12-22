import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int P = sc.nextInt();
   
   int pieces = A+P;

   int pie = pieces/3;
   
   System.out.println(pie);
   
   
 }
}