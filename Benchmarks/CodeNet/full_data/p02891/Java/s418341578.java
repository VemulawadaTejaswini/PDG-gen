import java.util.*;

class Main{
	static int f(String t){
		int c=0;
		for(int i=1;i<t.length();++i){
			if(t.charAt(i-1)==t.charAt(i)){
				++c;
				++i;
			}
		}
		return c;
	}

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		String t=s.next();
		long k=s.nextInt()-1,a=f(t),b=f(t+t)-a,c=f(t+t+t)-a;
		System.out.println(k/2*c+k%2*b+a);
	}
}
