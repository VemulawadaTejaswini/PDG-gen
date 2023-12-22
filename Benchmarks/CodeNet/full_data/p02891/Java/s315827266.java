import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		char A[]=new char[S.length()];
		long K=stdIn.nextInt();
		long ans=0;
		boolean fes=true;
		boolean key=false;
		for(int i=0;i<S.length();i++){
			A[i]=S.charAt(i);
			if(A[0]!=A[i])
				fes=false;
		}
		for(int i=0;i<S.length();i++){
			char a=A[i];
			char b;
			if(i!=S.length()-1)
				b=A[i+1];
			else{
				b=A[0];
				if(a==b)
					key=true;
			}
			if(a==b){
				if(i!=S.length()-1){
					A[i+1]=1;
				}
				ans++;
			}
		}
		for(int i=0;i<S.length();i++){
			A[i]=S.charAt(i);
		}
		if(key){
			if(S.length()>2&&A[1]!=A[2]&&A[0]==A[1]){
				ans--;
				ans*=K;
				
			}
			else{
				ans*=K;
				ans--;
			}
		}
		else
			ans*=K;
		if(fes)
			ans=(K*S.length())/2;
		System.out.println(ans);
	}
}
