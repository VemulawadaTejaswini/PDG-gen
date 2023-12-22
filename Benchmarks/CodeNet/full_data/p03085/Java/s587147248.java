import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Helix(sc.next());
  }

  static void Helix(String s){
    if(s.equals("A")){
      System.out.println("T");
    }else if(s.equals("T")){
      System.out.println("A");
    }else if(s.equals("G")){
      System.out.println("C");
    }else if(s.equals("C")){
      System.out.println("G");
    }
  }
}