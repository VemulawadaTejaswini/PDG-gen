import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    if(10 < a && 10 < b){
      System.out.println(a * b);
    }else{
      System.out.println(-1);
    }
  }
}