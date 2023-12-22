import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int L=sc.nextInt();
		int n=1;
		int m=0;
		boolean isover=false;
		int most=0;

		for (int i=0;isover==false;++i){
			if(L/3 != 0){
				L=L/3;
				m=m+3;
			}
			else{
				m=m+L%3;
				if (L%3!=0) {n=i+2; m=m+1;}
				else n=i+1;
				most=L%3;
				isover = true;
			}
		}

		System.out.println(n+" "+m);

		for (int i=n;i>2;--i){
			System.out.println((n-1)+" "+n+" "+0);
			System.out.println((n-1)+" "+n+" "+1*(int)Math.pow(3, n-i));
			System.out.println((n-1)+" "+n+" "+2*(int)Math.pow(3, n-i));
		}

		if (most == 0){
			System.out.println(1+" "+2+" "+0);
			System.out.println(1+" "+2+" "+1*(int)Math.pow(3, n-2));
			System.out.println(1+" "+2+" "+2*(int)Math.pow(3, n-2));
		}
		else{
			for (int i =0;i<=most;++i){
				System.out.println(1+" "+n+" "+i*(int)Math.pow(3,  n-2));
			}
		}

	}

}