import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    if(Math.min(h,w)==1){
      System.out.println(1);
      return;
    }
    if(h%2==0&&w%2==0){
      System.out.println((h*w)/2);
    }
    if(h%2==1 || w%2==1){
    if(h%2==1&&w%2==1){
      long ans = (((h+1)/2)*((w+1)/2)+((h/2)*(w/w)));
      System.out.println(ans);
      return;
    }
    System.out.println((h*w)/2);
  }
  }
}