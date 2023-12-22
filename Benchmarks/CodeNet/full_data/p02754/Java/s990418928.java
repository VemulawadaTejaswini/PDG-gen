import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long A = sc.nextInt(); //ao
    long B = sc.nextInt(); //aka
    long cnt = N/(A+B);
    long amari = N%(A+B);
    long x = 0;
    if(amari>=A){
      x =A;
    }else{
      x = amari;
    }
    long ans = A*cnt + x;
    System.out.println(ans);    
  }
}


