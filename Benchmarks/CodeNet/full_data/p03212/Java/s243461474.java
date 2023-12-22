import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int n=s.nextInt();
	public static void main(String[] $){
		System.out.println(f(0,0,0));
	}
	static int f(long v,int f,int d){
		return v>n?0:f/7+f(v*10+7,f|1,d+1)+f(v*10+5,f|2,d+1)+f(v*10+3,f|4,d+1);
	}
}
