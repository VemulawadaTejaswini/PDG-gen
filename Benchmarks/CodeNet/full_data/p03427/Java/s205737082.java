import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[]$){
		String v=s.next();
		System.out.println(v.charAt(0)-'0'-10+v.length()*9
				-(v.matches(".9*")?1:0));
	}
}