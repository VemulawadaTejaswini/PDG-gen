import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int count = 0;
	int divi = x / 500;
    for(int i = 0; i < divi + 1; i++) {
      count = count + ((x - 500 * i) / 100 + 1);
    }
    System.out.println(count);
  }
}