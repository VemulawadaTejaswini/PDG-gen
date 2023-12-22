import java.util.Scanner;
import java.util.*;
/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static boolean kaibun(String S,int N) {
		int i;
		String s1;
		String s2;
		if(N%2 != 0) {
			 s1 = S.substring(0,(N-1)/2);
			 s2 = S.substring((N-1)/2+1);
		}else {
			 s1 = S.substring(0,(N)/2);
			 s2 = S.substring((N)/2+1);
		}
		
        StringBuffer str2 = new StringBuffer(s2);
        s2 = str2.reverse().toString();
        
        //System.out.println(s1);
        //System.out.println(s2);
        
		if(s1.equals(s2)) {
			return true;
		}else {
			return false;
		}
		
	}