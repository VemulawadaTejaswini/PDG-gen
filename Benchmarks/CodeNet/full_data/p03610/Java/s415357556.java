import java.util.*;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		String v=s.next(),r="";
		for(int i=0;i<v.length();i+=2)
			r+=v.charAt(i);
		System.out.println(r);
		s.close();
	}
}