import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long sum = a+b;
    long roop = n/sum;
    long ans = roop*a;
    if(n%sum != 0 && a != 0){
      for(int i = 0; i < (n%sum);i++){
        ans++;
      }
    }
   System.out.println(ans);
  }
}