import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int cnt = 0;

    while(true) {
    	if(S.indexOf("ABC") != -1) {
    		cnt++;
    		S = S.replaceFirst("ABC", "CAB");
    	} else {
    		break;
    	}
    }
    System.out.println(cnt);
  }
}
