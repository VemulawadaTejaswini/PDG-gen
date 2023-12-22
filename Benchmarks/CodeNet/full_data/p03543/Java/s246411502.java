import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n[] = sc.next().split("");
    if (n[1].equals(n[2])){
      if(n[0].equals(n[1])){
        System.out.println("Yes");
      }else if (n[2].equals(n[3])){
        System.out.println("Yes");
      }
    }else{
      System.out.println("No");
    }
  }
}
