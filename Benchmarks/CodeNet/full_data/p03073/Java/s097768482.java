import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[] data = new int[s.length()+1];
    int[] ans = new int[s.length()+1];


    for (int i = 0; i < s.length(); i++) {
      data[i] = Integer.valueOf(s.substring(i,i+1));
      ans[i] = Integer.valueOf(s.substring(i,i+1));
    }

    for (int i = 1; i < s.length()-1; i++) {
      if (data[i-1]== data[i+1]) {
        if (data[i] == data[i+1]) {
          data[i] = Math.abs(data[i]-1);
        }
      } else {
        if (data[i-1] == data[i]) {
          data[i] = Math.abs(data[i]-1);
        } else {
          data[i+1] = Math.abs(data[i+1]-1);
        }
      }
    }

    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (data[i] != ans[i]) {
        count++;
      }
    }

    System.out.println(count);

  }

}
