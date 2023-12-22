import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		sc.close();
		int a = 0;
		for(int i = 0 ; i < s.length() ; i++){
			if(s.charAt(i) == '0')a++;
		}
		ou.print(2 * Math.min(a , s.length() - a) + "\n");
		ou.flush();
    }
}