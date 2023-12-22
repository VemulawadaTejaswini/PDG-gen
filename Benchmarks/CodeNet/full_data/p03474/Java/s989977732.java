import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.next();
        if(str.charAt(a) != '-') {
          System.out.println("No");
          return;
        }
        if(!isValid(str.substring(0, a), a) || !isValid(str.substring(a+1), b)) {
          System.out.println("No");
          return;
        }
        System.out.println("Yes");
    }

    private static boolean isValid(String str, int len) {
      if(str.length() != len) return false;
      for(char c : str.toCharArray()) {
        if(!Character.isDigit(c)) return false;
      }
      return true;
    }
}