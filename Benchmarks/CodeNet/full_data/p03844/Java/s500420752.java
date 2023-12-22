import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String s = scn.next();
      	int b = scn.nextInt();
      	int ans = 0;
      	if(s.equals("+")) ans = a+b;
      	else ans = a-b;
      	System.out.println(ans);
	}
}