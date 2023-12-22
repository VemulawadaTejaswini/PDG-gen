import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		String s = sn.next();
		long total = 0;
		System.out.println(sum(total,s));
	}
	
	public static long sum(long total,String s){
		long tmp = 0;
		int n = s.length();
		for(int i = 0; i < n ;++i){
			if(i == 0) tmp = total + Long.parseLong(s);
			else{
				tmp += sum(total + Long.parseLong(s.substring(0,i)),s.substring(i,n));
			}
		}
		return tmp;
	}
}
