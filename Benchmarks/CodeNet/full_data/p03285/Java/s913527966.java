import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int a = n/4;
    int b = n/7;
    boolean flag = false;

    for(int i=1; i<=a; i++){
      for(int j=1; j<=b; j++){
        if(4*i+7*j==n){
          flag = true;
          break;
        }
      }
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}