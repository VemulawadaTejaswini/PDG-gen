import java.util.Scanner;
 
public class Main{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int S = N / 2;
     double K = (double)(N - S) / (double)N;
     System.out.println(K);
   }
}