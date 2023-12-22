import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean flag = false;
    for(int i=0;i<s.length();i+=2) {
      if(s.charAt(i)=='L') {
        flag = true;
      }
    }

    for(int j=1;j<s.length();j+=2) {
      if(s.charAt(j) == 'R'){
        flag = true;;
      }
    }

    if(flag==false) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
}
}
