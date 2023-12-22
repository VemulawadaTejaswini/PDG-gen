import java.util.Scanner;

public class Main {
  public static void main(String... args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  int k = sc.nextInt();

	  if (b - a > 2 * k) {
		  for (int i = a ; i < a + k ; i++) {
			  System.out.println(i);
		  }
		  for (int j = b - k + 1 ; j < b + 1 ; j++) {
			  System.out.println(j);
		  }
	  } else {
		  for (int i = a ; i < b + 1 ; i++) {
			  System.out.println(i);
		  }
	  }
  }
}