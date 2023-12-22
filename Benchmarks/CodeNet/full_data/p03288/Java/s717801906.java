import java.util.*;


public class main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextLine();
    if (r < 1200) {
    	return "ABC";
    } else if(r < 2800) {
      	return "ARC";
    } else {
      	return "AGC;
    }
  }
}