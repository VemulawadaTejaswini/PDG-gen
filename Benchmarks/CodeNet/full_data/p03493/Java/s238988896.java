import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int count = 0;
		for(int i = 0;i < 3;i++) {
		    if(s[i] - '0' == 1) count++; 
		}

		System.out.println(count);
    }

}