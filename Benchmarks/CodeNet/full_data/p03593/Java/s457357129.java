import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		int[] map=new int[128];
		for(int i=0;i<n;i++){
			String str=sc.nextLine();
			for(char c:str.toCharArray()){
				map[c]++;
			}
		}

		int one=0;
		int two=0;
		int four=0;
		boolean nTag=((n&1)==1);
		boolean mTag=((m&1)==1);
		if(nTag&&mTag){
			one=1;
			two=n+m-2;
			four=n*m-one-two;
		}
		else if(nTag){
			two=m;
		}
		else if(mTag){
			two=n;
		}
		four=n*m-one-two;	
	
		for(int i='a';i<='z';i++){
			int res=map[i]/4*4;
			four-=res;
			two-=(map[i]%4)/2*2;
			map[i]-=two;
			one-=(map[i]&1);
		}

		if(one==0&&two==0&&four==0)
			System.out.println("Yes");
		else
			System.out.println("No");		
		
	}
}
