import java.util.Scanner;

public class Main{
  static long count = 0;

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long K = sc.nextInt();
    long A = sc.nextInt();
    long B = sc.nextInt();
    if(A+2>=B || K<=1 || K<=A+1){
      System.out.println(1+K);
    }
    else{
      count = count + B;
      K = K - (A+1);
      if(K==1){
        System.out.println(count+1);
      }
      else{
        if(K%2==0){
          count = count + (K/2)*(B-A);
          System.out.println(count);
        }
        else{
          count = count + (K/2)*(B-A) + 1;
          System.out.println(count);
        }
      }
    }

  }



}