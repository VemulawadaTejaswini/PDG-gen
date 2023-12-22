import java.io.*;
import java.util.*;
 
class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if (y == 3 || y == 5 || y == 7) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
	}
}