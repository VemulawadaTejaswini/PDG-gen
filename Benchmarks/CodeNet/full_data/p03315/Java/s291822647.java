import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		int t = 0;
		
		String S = new java.util.Scanner(System.in).nextLine();
		String[] ar = S.split("");
		for(int i=0;i<4;i++) {
			if(ar[i] == "+") {
				t++;
			}
			else {
				t--;
			}
		}
		
		System.out.println(t);
	}

}
