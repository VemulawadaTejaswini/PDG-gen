import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine().replace(" ", ""));
    System.out.println(n);
    if(Math.sqrt(n) == Math.floor(Math.sqrt(n))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}