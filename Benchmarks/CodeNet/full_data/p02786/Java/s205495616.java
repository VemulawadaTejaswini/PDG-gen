import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    int a = 0;
    long ans = 1;
    for(int i = 1;;i++){
      h /= 2;
      ans += (long)(Math.pow(2,i));      
      if(h == 1){
        System.out.println(ans);
        break;
      }
    }
  }
}