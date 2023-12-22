import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long k=sc.nextLong();
		if(s.length()==1) {
			System.out.println(k/2);

			return;
		}

		char a=s.charAt(0);
		Boolean kaeta[]=new Boolean[s.length()];
		long cnt=0;
		kaeta[0]=false;
		for(int i=1;i<s.length();i++) {
			char b=s.charAt(i);
			if(b==a&&!kaeta[i-1]) {
				cnt++;
				kaeta[i]=true;
			}else {
				kaeta[i]=false;
			}
			a=b;
		}
		//System.out.println(cnt);
		if(a==s.charAt(0)&&!kaeta[s.length()-1]) {
			if(k%2==0) {
				cnt=cnt*2+1;
				System.out.println(cnt*k/2);

			}else {
				//System.out.println(cnt+" "+k);
				System.out.println((cnt*2+1)*(k/2)+cnt);
			}
			return;

		}
		cnt*=k;

		System.out.println(cnt);
	}
}
