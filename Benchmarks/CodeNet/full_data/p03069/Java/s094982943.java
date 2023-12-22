import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		int whiteLength = s.replace("#", "").length();
		String[] stones = s.split("");
		int reverse = 0;
		for(int i=0;i<n;i++) {
			if(i<n-1){
				if(stones[i].equals("#")) {
					reverse++;
				}
			}
		}
		if(whiteLength < reverse) {
			System.out.println(whiteLength);
		}else {
			System.out.println(reverse);
		}
	}
}
