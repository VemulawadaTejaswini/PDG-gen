import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int n = Integer.parseInt(sc.next());
      int a = Integer.parseInt(sc.next());
      int all = n * n;
      System.out.println(all - a);
    }
  }
}