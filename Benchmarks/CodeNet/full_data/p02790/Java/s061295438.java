import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int s = Math.min(a,b);
    int l = Math.max(a,b);
    for(int i=0;i<l;i++){
      System.out.print(s);
    }
    System.out.println();
  }
}
