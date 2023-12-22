import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String e ="keyence";
		for(int i = 1; i <= 7; i++){
				if((a.substring(0,i)).equals(e.substring(0,i))){
						if((a.substring(a.length()-i-1,a.length())).equals(a.substring(a.length()-i-1,a.length()))){
							System.out.println("YES");
							return;
						}
				}
		}
		System.out.println("NO");
	}
}