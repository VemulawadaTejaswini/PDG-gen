import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double keisan = (n/1.08);
    long x = Math.round(keisan);
    long sum = (long)(x*1.08);
    
    if(n == sum){
      System.out.println(x);
    }else{
      System.out.println(":(");
    }
  }
}