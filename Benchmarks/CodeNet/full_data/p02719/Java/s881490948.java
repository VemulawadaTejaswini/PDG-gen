import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(); 
    int y = scanner.nextInt();
    if(x<y){
      System.out.print(x);
    }
    else{
      int a = x%y;
      if(a==0){
        System.out.print(a);
      }
      //System.out.print(a);
      else{
        int b = Math.abs(y-a);
      	System.out.print(b);
      }   
     }
  }
}