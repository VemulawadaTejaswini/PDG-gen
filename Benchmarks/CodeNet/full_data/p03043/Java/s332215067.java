import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    double pp = 0;

    for(int i=1; i<=n; i++){
      int count = 0;
      int m = i;
      while(m<k){
        m = m * 2;
        count +=1;
      }
      pp += 1/Math.pow(2, count);
    }

    System.out.println(pp*1/n);
  }
}