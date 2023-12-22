import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for(int i=105;i<=n;i++){
      if(i%2==1){
        if(check(i)){
          count++;
        }
      }
    }
    System.out.println(count);
  }   
  static boolean check(int n){
    int count=0;
      for(int i=1;i<=n;i++){
        if(n%i == 0){
          count++;
        }
      }
    if(count==8){
      return true;
    }else{
      return false;
    }
  }
}