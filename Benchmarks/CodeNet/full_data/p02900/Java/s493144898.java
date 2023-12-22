import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		long a=0,b=0,k=2;
		int ans=0;
		while(true){
			if(A%B!=0){
				a=A%B;
				A=B;B=a;
			}
			else
				break;
		}a=B;b=a/2+1;
		HashMap<Long,Boolean> c=new HashMap<Long,Boolean>();
		while(true){
			while(true){
				if(a%k!=0)
					k+=2;
				else
					break;
				if(k==4)
					k=3;
			}
			b=a/k;
			if(c.containsKey(a/b)==false){
				ans++;
				c.put(a/b,true);
				while(true){
					if(b%k!=0)
						break;
					b/=k;
				}
			}
			if(b==1)
				break;
			a=b;k=2;
		}
		ans++;
		System.out.println(ans);
	}
}
