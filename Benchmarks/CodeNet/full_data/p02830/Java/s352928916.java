import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
      	String t = scn.next();
      	String[] list1 = s.split("");
      	String[] list2 = t.split("");
      	String ans = "";
      	for(int i=0; i<n; i++){
          ans = ans + list1[i] + list2[i];
        }
      	System.out.println(ans);
	}
}
