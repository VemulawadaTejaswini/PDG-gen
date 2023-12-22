import java.util.*;

public class Main {
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  char[] sArray = s.toCharArray();
  int count = 0;
  for(int i = 0; i < sArray.length - 1; i++) {
       if(i != 0) {
            count++;
       }
  }
  System.out.println(String.valueOf(sArray[0]) + count + String.valueOf(sArray[sArray.length - 1]));
 }
}