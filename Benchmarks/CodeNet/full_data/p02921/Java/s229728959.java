import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){

		String S,T;
		

		//////入力/////////
		Scanner stdIn = new Scanner(System.in);
		S = stdIn.next();
		T = stdIn.next();

		char[] S_char = S.toCharArray();
		char[] T_char = T.toCharArray();

		int ans = 0;

		for(int i = 0;i < 3;i++){
			if(S_char[i] == T_char[i]){
				ans++;
			}
		}

		System.out.println(ans);
		
		
	}
}