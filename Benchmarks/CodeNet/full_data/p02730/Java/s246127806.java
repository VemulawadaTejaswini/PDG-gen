import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    System.out.println(isStrongPalindrome(s) ? "Yes" : "No");
  }
  static boolean isStrongPalindrome(String s){
    int left1 = 0;
    int right1 = s.length() - 1;
    int left2 = 0;
    int right2 = ((s.length() - 1 ) / 2) - 1;
    while(left1 <= right1){
      if(s.charAt(left1) != s.charAt(right1)){
        return false;
      }
      left1++;
      right1--;
    }
    while(left2 <= right1){
      if(s.charAt(left2) != s.charAt(right2)){
        return false;
      }
      left2++;
      right2--;
    }
    return true;
  }
}
