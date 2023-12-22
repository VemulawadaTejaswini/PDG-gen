import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		boolean AC[]=new boolean[N];
		int WA[]=new int[N];
		int ac=0,wa=0;
		for(int i=0;i<M;i++){
			int p=stdIn.nextInt()-1;
			String S=stdIn.next();
			if(S.equals("AC"))
				AC[p]=true;
			if(AC[p]==false&&S.equals("WA"))
				WA[p]++;
		}
		for(int i=0;i<N;i++){
			if(AC[i]){
				ac++;
				wa+=WA[i];
			}
		}
		System.out.println(ac);
		System.out.println(wa);
	}
}
