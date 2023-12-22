import java.util.*;

public class Main{
	public static void main(String[] args){
		int count=0;
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='o') count++;
		}
		count=count+15-s.length();
		if(count>=8) System.out.println("YES");
		else System.out.println("NO");
	}
}
				
