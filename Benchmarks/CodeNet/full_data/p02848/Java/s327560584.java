import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char[] ans=new char[s.length()];
		for(int i=0; i<s.length(); i++){
			ans[i]=(char)('A'+(s.charAt(i)+n-'A')%26);
			System.out.print(ans[i]);
		}
	}
}
