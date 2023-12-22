import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int N =sc.nextInt();		
			int ansi=1;
			int ans=0;
			int tmp=0;
			int X=0;
						
			for(int i=1;i<N+1;i++){
				tmp=0;
				 X=i;
				for(;X%2==0;){
					tmp++;		
					X=X/2;
				}
				if(tmp>ans){
					ans=tmp;
					ansi=i;
				}
			}
			System.out.println(ansi);
		}
}