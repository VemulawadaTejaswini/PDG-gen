import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanp = new Scanner(System.in);
    int p = scanp.nextInt();
    
    Scanner scanq = new Scanner(System.in);
    int q = scanq.nextInt();
    
    Scanner scanr = new Scanner(System.in);
    int r = scanr.nextInt();
    
    int sum1 = p + q;
    int sum2 = p + r;
    int sum3 = q + r;
    
    if(sum1 <= sum2 && sum1 <= sum3){
      System.out.println(sum1);
    }else if(sum2 <= sum1 && sum2 <= sum3){
      System.out.println(sum2);
    }else{
      System.out.println(sum3);
    }
  }
}