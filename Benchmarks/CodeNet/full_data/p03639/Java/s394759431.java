import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int fC=0;
		int oC=0,eC=0;
		int t=N;
		while (t-- > 0) {
			int n=sc.nextInt();
			if(n%4==0)
				fC++;
			else if(n%2==0)
				eC++;
			 else 
				 oC++;
		}
		if(eC>0)oC++;
		if(oC-1<=fC||oC==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
