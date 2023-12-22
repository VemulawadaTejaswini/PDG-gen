import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String st = sc.next();
		
		char[] c = s.toCharArray();
		char[] ch =st.toCharArray();
		
		int count = 0;
		
		if(c[0] == ch[0]){
			count++;
		} 
		if(c[1] == ch[1]){
			count++;
		}
		
		if(c[2] == ch[2]){
			count++;
		}
		
		System.out.println(count);
	}
}