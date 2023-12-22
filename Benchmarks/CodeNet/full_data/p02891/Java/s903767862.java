import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		char A[]=new char[S.length()];
		long K=stdIn.nextInt();
		long ans=0;
		for(int i=0;i<S.length();i++){
			A[i]=S.charAt(i);
		}
		for(int i=0;i<S.length();i++){
			char a=A[i];
			char b;
			if(i!=S.length()-1)
				b=A[i+1];
			else
				b=A[0];
			if(a==b){
				if(i!=S.length()-1)
					if(A[i]!='a')
						A[i+1]='a';
					else
						A[i+1]='b';
				ans++;
			}
		}
		ans*=K;
		System.out.println(ans);
	}
}
