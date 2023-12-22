import java.util.*;

class Main{
  public static void main(String[] args){
    String[] numbers = str.split(" ");
    int a = numbers[0];
    int b = numbers[1];
    
   if(a>=1&&a<=9&&b>=1&&b<=9){
     System.out.println(a*b);
   }else{
     System.out.println(-1);
   }
     
  }
}
