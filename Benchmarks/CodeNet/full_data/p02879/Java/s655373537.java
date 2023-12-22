import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String a = scan.nextInt();
    String b = scan.nextInt();
    
    
   if(a>=1&&a<=9&&b>=1&&b<=9){
     System.out.println(a*b);
   }else{
     System.out.println(-1);
   }
     
  }
}
