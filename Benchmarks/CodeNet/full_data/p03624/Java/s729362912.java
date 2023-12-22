import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S[] = sc.next().split("");
    List<String> list = Arrays.asList(S);
    
    String[] alphabets = { "a", "b", "c", "d", "e", 
                          "f", "g", "h", "i", "j", 
                          "k", "l", "m", "n", "o", "p",
                          "q", "r", "s", "t", "u", 
                          "v", "w", "x", "y", "z"};
    String ans = "None";
    for(String s : alphabets) {
      if (list.indexOf(s) == -1) {//if not appeared
        ans = s;
        break;
      }
    }
    System.out.println(ans);
  }
}
    
    