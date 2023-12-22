import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long ans=Long.MAX_VALUE;
		long[] b=new long[n];
		if(s.charAt(0)=='#'){
			b[0]=1;
		}
		for(int i = 1; i<s.length(); i++){
			if(s.charAt(i)=='#'){
				b[i]=b[i-1]+1;
			}else{
				b[i]=b[i-1];
			}
		}
		for(int i = 0; i<s.length(); i++){
			ans=Math.min(ans,2*b[i]+s.length()-i-1-b[s.length()-1]);
		}
		System.out.println(ans);
	}
}
