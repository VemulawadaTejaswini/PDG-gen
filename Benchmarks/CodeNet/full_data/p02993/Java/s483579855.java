import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

	String s = sc.next();
	
	char c0 = s.charAt(0);
	char c1 = s.charAt(1);
	char c2 = s.charAt(2);
	char c3 = s.charAt(3);
	
	String result = "Good";
	
	if (c0 == c1) {
		result = "Bad";
	}
	if (c1 == c2) {
		result = "Bad";
	}
	if (c2 == c3) {
		result = "Bad";
	}

    System.out.println(result);
  }
}

