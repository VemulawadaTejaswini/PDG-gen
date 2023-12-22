import java.util.*;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		
		String v=s.next();
		long n=s.nextLong();
		for(int i=0,e=(int)Math.min(v.length(),n);i<e;++i) {
			if(v.charAt(i)!='1') {
				System.out.println(v.charAt(i));
				return;
			}
		}
		System.out.println('1');
	}
}
