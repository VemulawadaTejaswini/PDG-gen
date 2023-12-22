import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();//1円玉の数
    if(n % 500 > a){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
