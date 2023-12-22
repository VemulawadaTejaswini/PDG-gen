import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt=0,n=b;
		for(int i=1; i<= b/a ; i++) {
			if(cnt == c) {
				break;
			}
			cnt ++;
		}
		System.out.println(cnt);
    }
}
