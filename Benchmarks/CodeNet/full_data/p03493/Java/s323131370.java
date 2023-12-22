import java.util.*;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
	  	result = Character.getNumValue(str.charAt(i));
    }
    System.out.println(result);
  }
}
