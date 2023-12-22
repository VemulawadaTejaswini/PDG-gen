import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = a % b;
    int k = d;
    while(true){
      if(c==k){
        System.out.println("YES");
        return;                
      }
      k += d;
      if(k > d){
      k -= d;
      }
      if(k == d){
        System.out.println("NO");
        return;
      
      }
    }
  }

}