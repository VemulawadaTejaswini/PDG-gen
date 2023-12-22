import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = sc.next();
		int flag = 0;
		for(int i=0;i<(n/2);i++){
		    if(st.charAt(i) != st.charAt(i+(n/2)))
		    {
		        flag = 1;
		        break;
		    }
		}
		if(flag == 1)
		System.out.println("NO");
		else
		System.out.println("YES");
	}
}