import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String regex = "7";
    Pattern p = Pattern.compile(regex);

    check(p, s);
  }

  private static void check(Pattern pattern, String target){
    Matcher matcher = pattern.matcher(target);
    if (matcher.find())
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
