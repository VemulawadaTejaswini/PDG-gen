

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		char S[] =  new char[100];
		S=sc.nextLine().toCharArray();
		int x=0;
		int xmax=0;
		for(int i=1 ; i<=N;i++){
			if(S[i]=='I'){x++;}
			else if(S[i]=='D'){x--;}
			if(x>xmax)xmax=x;
		}
		System.out.println(xmax);
	}

}
