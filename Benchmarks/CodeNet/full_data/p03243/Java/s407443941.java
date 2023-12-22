import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
    String str = String.valueOf(a);
    int[] manieth = new int[3];
    int answer = 0;

    for (int i = 0; i < str.length(); i++) {
      String num = String.valueOf(str.charAt(i));
      manieth[i] = Integer.parseInt(num);
    }
    if (manieth[0] < manieth[1] || manieth[0] == manieth[1] && manieth[1] < manieth[2]) {
      answer = manieth[0] + 1;
    } else {
      answer = manieth[0];
    }
    System.out.print(answer);
    System.out.print(answer);
    System.out.print(answer);
	}
}
