import java.util.Scanner;
 
public class Main {
	static int count = 0;
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
 
    System.out.println(counter(N, ""));
  }
  public static int counter(long n, String num) {
    if (!num.equals("") && Long.valueOf(num) > n) {
      return 0;
    } 
    if (num.contains("7") && num.contains("5") && num.contains("3")) {
    	count++;
    }
    counter(n, num + "7");
    counter(n, num + "5");
    counter(n, num + "3");
    return count;
  }
}
