import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String s1[] = s.split("");
    String ans[] = {"Bad", "Good"};
    int a = 1;
    for (int i = 1; i < 4; i++){
      if (s1[i].equals(s1[i-1])) a *= 0;
    }
    System.out.println(ans[a]);
  }
}
