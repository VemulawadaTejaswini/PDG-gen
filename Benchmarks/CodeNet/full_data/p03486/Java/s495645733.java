import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    String s1[] = s.split("");
    String t1[] = t.split("");
    Arrays.sort(s1, Comparator.reverseOrder());
    Arrays.sort(t1, Comparator.reverseOrder());
    String ss = String.join("", s1);
    String tt = String.join("", t1);
    if (ss.length() < tt.length()){
      for (int i = 0; i < s.length(); i++){
        if (t1[i].compareTo(s1[i]) > 0){
          System.out.println("Yes");
          return;
        }
      }
      if (tt.substring(0, ss.length()).equals(ss)){
        System.out.println("Yes");
        return;
      }
    }else{
      for (int i = 0; i < t.length(); i++){
        if (t1[i].compareTo(s1[i]) > 0){
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
