import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		String s=scn.next();
		int ans=1;
		for(int j=1;j<n;j++) {
			if(s.charAt(j)!=s.charAt(j-1)) {
				ans++;
			}
		}System.out.println(ans);
    }
}