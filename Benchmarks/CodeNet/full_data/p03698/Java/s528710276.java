import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Arrays.sort(s);
		int result = 0;
		for(int i = 0; i < s.length-1;i++) {
			if(s[i]==s[i+1])result=1;
		}
		if(result == 0)System.out.print("yes");
		else System.out.print("no");
	}

}