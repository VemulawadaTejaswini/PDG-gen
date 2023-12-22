import java.util.*;
public class Main{
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int max = 0;
      for(int i = 1;i <= 31;i++){
         for(int j = 2;j <= 9;j++){
             if(Math.pow(i,j) <= x) max = Math.max(max,(int)Math.pow(i,j));
         }
      }
      System.out.println(max);
     }
}
