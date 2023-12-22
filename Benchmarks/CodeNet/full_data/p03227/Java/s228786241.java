import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S1 = sc.next();
		
		int s1Len = S1.length();
		
		if(s1Len == 2){
			System.out.println(S1);
		}else{
			
			String a = S1.substring(0,1);
			String b = S1.substring(2,3);
			
			S1 = S1.replace(b,a);
			S1 = S1.replaceFirst(a,b);
			
			System.out.println(S1);
		}
	}
}
