import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int OO = 0 , OX = 0 , XO = 0;
		int yono = 0;
		for(int i = 0 ; i < n ; i++){
			String s = sc.next();
			if(s.charAt(0) == 'B' && s.charAt(s.length() - 1) == 'A') OO++;
			else if(s.charAt(0) == 'B') OX++;
			else if(s.charAt(s.length() - 1) == 'A') XO++;
			for(int ii = 0 ; ii < s.length() - 1 ; ii++){
				if(s.charAt(ii) == 'A' && s.charAt(ii + 1) == 'B') yono++;
			}
		}
		yono += OO + Math.min(OX , XO);
		if(OX == XO && OX == 0) yono--;
		ou.print(yono + "\n");
		ou.flush();
    }
}