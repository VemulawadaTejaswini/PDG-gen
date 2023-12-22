import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    int count = 0;
    while(n > 0){
      n = n/k;
      count++;
    }
    System.out.println(count);
  }
}
