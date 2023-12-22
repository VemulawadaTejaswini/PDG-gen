
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     boolean flag=false;
     while(n>0)
     {
         if(n%10==7)
              flag=true;
         n/=10;

     }
     if(flag)
          System.out.println("Yes");
     else
         System.out.println("No");

    }
}
