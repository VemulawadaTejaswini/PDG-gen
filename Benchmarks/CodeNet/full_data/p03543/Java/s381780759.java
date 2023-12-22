import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		if(n.charAt(0)==n.charAt(1) && n.charAt(1)==n.charAt(2)){
			System.out.println("Yes");
		}
		else if(n.charAt(1)==n.charAt(2) && n.charAt(2)==n.charAt(3)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
