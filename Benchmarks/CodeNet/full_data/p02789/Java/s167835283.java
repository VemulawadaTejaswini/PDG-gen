import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    if(n==m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    // System.out.println(n);
  }
}
