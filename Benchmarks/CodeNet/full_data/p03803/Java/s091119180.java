import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a != 1 && b != 1){
      if(a > b){
        System.out.println("Alice");
      }
      else if(a < b){
        System.out.println("Bob");
      }
      else{
        System.out.println("Drow");
      }
    }
    else{
      if(a == 1 && b != 1){
        System.out.println("Alice");
      }
      else if(a != 1 && b == 1){
        System.out.println("Bob");
      }
      else{
        System.out.println("Drow");
      }
    }
  }
}
