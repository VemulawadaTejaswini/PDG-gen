import java.util.Scanner;

public class Main {
  
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         String arr[]={"Sunny","Cloudy","Rainy" };
         String s;
         s=input.next();
         for(int i=0;i<3;i++)
         {
             if(s==arr[i])
             {
                 System.out.println(arr[i+1]);
                 break;
             }
         }
         
     }
}