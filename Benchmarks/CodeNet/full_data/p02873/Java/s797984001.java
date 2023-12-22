import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int A[]=new int[S.length()+1];
		int ans=0;
		for(int i=0;i<S.length();i++){
			char c=S.charAt(i);
			if(c=='<'&&A[i+1]<=A[i])
				A[i+1]=A[i]+1;
		}
		for(int i=S.length()-1;i>0;i--){
			char c=S.charAt(i);
			if(c=='>'&&A[i]<=A[i+1])
				A[i]=A[i+1]+1;
		}
		for(int i=0;i<S.length()+1;i++){
			ans+=A[i];
		}
		System.out.println(ans);
	}
}