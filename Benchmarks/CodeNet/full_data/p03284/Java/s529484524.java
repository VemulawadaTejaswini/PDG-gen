import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();

      if(n<k){
        System.out.println(1);
        System.exit(0);
      }
      if(n%k==0){
        System.out.println(0);
      }
      if(n%k!=0){
        System.out.println(1);
      }

      }
}