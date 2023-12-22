import java.util.Scanner;
public class Main{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    double N = (double)sc.nextInt();
    double x = Math.floor(N*0.926);

    if(Math.floor(x*1.08)==N){
      System.out.println((int)x);
    }else if(Math.floor((x+1)*1.08)==N){
      System.out.println((int)(x+1));
    }else if(Math.floor((x-1)*1.08)==N){
      System.out.println((int)(x-1));
    }else if(Math.floor((x+2)*1.08)==N){
      System.out.println((int)(x+2));
    }else if(Math.floor((x-2)*1.08)==N){
      System.out.println((int)(x-2));
    }else{
      System.out.println(":(");
    }
  }
}