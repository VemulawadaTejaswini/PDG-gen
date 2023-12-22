import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String[] c = new String[6];
		for(int i=0; i<6; i++){
			c[i] = scn.next();
		}
      	String ans = "NO";
      	if(c[0].equals(c[5]) && c[1].equals(c[4]) && c[2].equals(c[3])) ans = "YES";
      	System.out.println(ans);
	}
}
