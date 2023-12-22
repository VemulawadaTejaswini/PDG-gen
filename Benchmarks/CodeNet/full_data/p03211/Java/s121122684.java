import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int min = Integer.MAX_VALUE;

    for(int i = 0; i + 2 < s.length(); i++){
      String ss = s.substring(i, i+3);
      min = Math.min(Math.abs(753 - Integer.parseInt(ss)), min);
    }

    System.out.println(min);
  }
}