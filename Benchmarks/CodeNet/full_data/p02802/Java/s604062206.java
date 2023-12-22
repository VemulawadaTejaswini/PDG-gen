import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		boolean AC[]=new boolean[N];
		int ac=0,wa=0;
		for(int i=0;i<M;i++){
			int p=stdIn.nextInt()-1;
			String S=stdIn.next();
			if(S.equals("AC")&&AC[p]==false){
				AC[p]=true;ac++;
			}
			if(AC[p]==false&&S.equals("WA"))
				wa++;
		}
		System.out.println(ac);
		System.out.println(wa);
	}
}
