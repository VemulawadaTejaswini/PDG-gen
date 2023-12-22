import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.nextString();
		int counter = 0;
      	if (s[0] == "1") counter++;
      	if (s[1] == "1") counter++;
      	if (s[2] == "1") counter++;
      	System.out.printf(counter);
      
	}
}