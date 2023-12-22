import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = a + b;
    
    if(10 <= c){
      System.out.println("error");
    }else{
      System.out.println(c);
    }
  }
}
    