import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int takahashi = sc.nextInt();
    int aoki = sc.nextInt();
    int k = sc.nextInt();
    if(k > takahashi){
      k -= takahashi;
      takahashi = 0;
      if(k > aoki){
        k-= aoki;
        aoki = 0;
      }else{
        aoki -= k;
      }
    }else{
      takahashi -= k;
    }
    System.out.println(takahashi + " " + aoki);
  }
}