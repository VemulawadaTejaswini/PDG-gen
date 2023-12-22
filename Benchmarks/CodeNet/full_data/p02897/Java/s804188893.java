Odd.java;
import java.util.Scanner;
public class Odd{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int odd=0;
      System.out.println("Enter N : ");
      int N=sc.nextInt();
      for(int i=1;i<=N;i++){
         if(i%2!=0)
            odd++;
      }
      double probability=(double)odd/N;
System.out.println("Probability : "+probability);
}
}