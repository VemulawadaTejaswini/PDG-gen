import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count = 0;
    int length = S.length();

    for(int i = 0; i < length/2; i++){
      char a = S.charAt(i);
      char b = S.charAt(length - 1 -i);

      if(!(a == b)){
        count++;
      }
    }
    System.out.println(count);
  }
}