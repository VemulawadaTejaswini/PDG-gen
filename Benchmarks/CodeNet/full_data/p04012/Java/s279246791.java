import java.util.*;

public class Main {
 	
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
	
    int[] map = new int[26];
    for (int c : s.toCharArray()) {
    	map[c-'a']++;
    }
    for (int freq : map) {
     	if (freq % 2 != 0) {
         	System.out.println("No");
          	return;
        }
    }
    System.out.println("Yes");
  }
}