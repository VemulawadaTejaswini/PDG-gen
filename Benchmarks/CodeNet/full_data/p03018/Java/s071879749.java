import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ch=false;
		long ans=0;
		int acou=0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='A'){
				acou++;
				ch=true;
			}else if(i<s.length()-1 && ch && s.charAt(i)=='B' && s.charAt(i+1)=='C'){
				i++;
				ans+=acou;
			}else{
				acou=0;
				ch=false;
			}
		}
		System.out.println(ans);
	}
}
