import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		String s=sc.next();
		int k=sc.nextInt();
		char c[]=new char[n];

		for(int i=0;i<n;++i){
			if(s.charAt(k-1)==s.charAt(i))c[i]=s.charAt(k-1);
			else c[i]='*';
			System.out.print(c[i]);
		}
		System.out.println();


	}
}