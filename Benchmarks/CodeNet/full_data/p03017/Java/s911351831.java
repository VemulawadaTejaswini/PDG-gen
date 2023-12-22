import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int A=sc.nextInt()-1;
		int B=sc.nextInt()-1;
		int C=sc.nextInt()-1;
		int D=sc.nextInt()-1;
		String str=sc.next();

		sc.close();

		boolean flag=true;

		for(int i=0;i<N-1;i++){
			if(str.charAt(i)=='#' && str.charAt(i+1)=='#'){
				flag=false;
				break;
			}
		}

		if(C>D){

			int cnt=0;
			for(int i=B;i<=D;i++){
				if(str.charAt(i)=='.' && str.charAt(i+1)=='.' && str.charAt(i+2)=='.'){
					cnt++;
				}
			}

			if(cnt==0) flag=false;

		}


		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}

}
