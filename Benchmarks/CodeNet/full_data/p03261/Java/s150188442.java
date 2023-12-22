import java.util.*;
public class Main{
	static String ShiriJudge(int m,String[] s){
		boolean bl = true;
		for(int i=0; i<m-1; i++){
			if(s[i].charAt(s[i].length()-1) != (s[i+1].charAt(0)))return "No";
		}
		for(int i=0; i<m; i++){
			for(int j=i+1; j<m; j++){
				if(s[i].equals(s[j]))return "No";
			}
		}
		return "Yes";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] w = new String[n];
		for(int i=0; i<n; i++){
			w[i] = sc.next();
		}
		System.out.println(ShiriJudge(n,w));
	}
}