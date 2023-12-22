
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		String mac="p";
		for(int i=0;i<n;i++) {
			mac="b"+mac+"p"+mac+"b";
		}
		mac=mac.substring(mac.length()-x,mac.length() );
		int ans =mac.length()-mac.replace("p","").length();	
		System.out.println(ans);
	}
}
