import java.util.ArrayList;
import java.util.*;
class Main{
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a==b && b==c && a==c){
         System.out.println("Yes");
         System.exit(0);
      }else{
         System.out.println("No");
         System.exit(0);
      }
   }
}  