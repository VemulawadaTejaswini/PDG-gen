import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String k = sc.next();
		int i = 0;
		char ans = s.charAt(0);
		while(ans == '1'){
			i++;
			ans = s.charAt(i);
		}
		
		if(k.length()>3||Integer.parseInt(k)>i)System.out.println(ans);
		else System.out.println(1);
	}
}