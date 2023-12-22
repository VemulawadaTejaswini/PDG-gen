import java.util.Scanner;

public class Main {
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   int k = sc.nextInt();
   int x = sc.nextInt();
   
   String res = "";
   
   if(500 * k >= x){
     res = "Yes";
   }else{
     res = "No";
   }
   
   System.out.println(res);
   }
}