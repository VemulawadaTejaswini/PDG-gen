import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String[] S1 = S.split("");
		String[] ans = new String[S.length()];
		int idx = 0;

		for(int i=S.length()-1; i>-1; i--){
			if(S1[i].equals("B")){
				i--;
			}else if(S1[i].equals("0")){
				ans[idx] = "0";
				idx++;
			}else if(S1[i].equals("1")){
				ans[idx] = "1";
				idx++;
			}
		}

		for(int i=idx-1; i>-1; i--){
			System.out.print(ans[i]);
		}

		System.out.println("");
	}
}