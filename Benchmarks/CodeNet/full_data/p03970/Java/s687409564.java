import java.util.*;
public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String __[]){
		String t="CODEFESTIVAL2016",in=s.next();
		int count=0;
		for(int i=0;i<t.length();i++)
			if(t.charAt(i)!=in.charAt(i))
				count++;
		System.out.println(count);
	}
}
