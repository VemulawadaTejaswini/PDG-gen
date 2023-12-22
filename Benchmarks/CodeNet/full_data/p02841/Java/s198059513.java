import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    String[] T = sc.nextLine().split(" ");
    System.out.println(S[0].equals(T[0]) ? 0 : 1);
  }
}