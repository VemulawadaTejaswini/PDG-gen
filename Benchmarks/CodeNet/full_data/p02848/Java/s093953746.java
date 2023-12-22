import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int add = sc.nextInt();
		String s = sc.next();
		char[] s_chars = s.toCharArray();
		
		int nam = s.length();
		for(int i = 0;i < nam ; i++){
		    char xx = s_chars[i];
		    if((char)(xx + add ) > 'Z'){
		        System.out.print((char)((xx + add) - 26));
		    }else{
		        System.out.print((char)(xx + add));
		    }
		}
		
    }
}
