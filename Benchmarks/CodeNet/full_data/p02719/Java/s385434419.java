import java.util.Scanner;
import java.lang.Math;
public class Main{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    long k = a.nextLong();
    long n = a.nextLong();
    if(n == 0){
            System.out.print(k);
            break;
        }
    while(k>=0){
        
        if(n == 1){
            System.out.print(0);
            break;
        }
        
        
        if(k<0){
            System.out.print(Math.abs(k));
        }
        if(k < n ){
            System.out.print(Math.min(k, Math.abs(k-n)));
        }
        k -= n;
    }
  }

}
