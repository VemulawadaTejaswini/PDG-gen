import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
	  int[] arr = new int[]{1, 1, 1};
      for(int i = 0; i < s.length(); i++) {
      	char c = s.charAt(i);
        arr[i-'a']--;
        if(arr[i-'a'] < 0) {
        	System.out.println("No");
          	return;
        } 
      }
      System.out.println("Yes");
  }
}