import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans=s.length();
		int an=0;
		for(int i = 0; i<s.length()-1; i++){
			if(s.charAt(i)!=s.charAt(i+1)){
				an=Math.max(i+1,s.length()-i-1);
				ans=Math.min(ans,an);
			}
		}
		System.out.println(ans);
	}
}
