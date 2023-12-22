import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int j = 1;
    if (b<=a){
      for (int i=1;i<=a;i++){
        j*=10;
      }
        System.out.println(b*(j-1)/9);}
    else {
      for(int i=1;i<=b;i++){
        j*=10;
      }
      System.out.println(a*(j-1)/9);};
  }
}
          
