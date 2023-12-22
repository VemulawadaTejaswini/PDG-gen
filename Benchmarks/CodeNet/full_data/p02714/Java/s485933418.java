import java.util.Scanner;
//import java.util.Random;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n=stdIn.nextInt();
		String s=stdIn.next();
		
		int[] cnt=new int[3];
		for(int i=0;i<n;++i){
			char c=s.charAt(i);
			if(c=='R') cnt[0]++;
			else if(c=='G') cnt[1]++;
			else if(c=='B') cnt[2]++;
		}
		
		long ans=1;
		for(int i=0;i<3;++i) ans*=cnt[i];
		
		for(int i=0;i<n;++i){
			int l=1;
			while(0<=i-l && i+l<n){
				if(s.charAt(i-l)==s.charAt(i) || s.charAt(i)==s.charAt(i+l) || s.charAt(i+l)==s.charAt(i-l)){}
				else ans--;
				l++;
			}
		}
		
		System.out.println(ans);
	}
}