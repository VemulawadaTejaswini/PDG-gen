import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int v = n/500;
    if(n-(500*v)<=a) System.out.println("Yes");
    else System.out.println("No");
  }
}