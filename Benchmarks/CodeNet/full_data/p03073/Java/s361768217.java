import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch='2';
		int ans=0;
		for(int i =0; i<s.length(); i++){
			if(s.charAt(i)==ch){
				ans++;
				ch=s.charAt(i)=='0'?'1':'0';
			}else{
				ch=s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
