import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    if(b-a+1<=2*k){
      for(int i = a;i<=b;i++){
        System.out.println(i);
      }
      return;
    }
    for(int i = a;i<=a+k-1;i++){
      System.out.println(i);
    }
    for(int i = b - k + 1;i<=b;i++){
      System.out.println(i);
    }
  }
}
