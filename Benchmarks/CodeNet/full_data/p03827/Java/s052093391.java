

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	String s = sc.nextLine();
	int ans = 0;
	for(int i = 0, x = 0;i < n;i++){
	    if(s.charAt(i) == 'I')
		x++;
	    else if(s.charAt(i) == 'D')
		x--;
	    ans = Math.max(ans, x);
	}
	System.out.println(ans);
    }

}
