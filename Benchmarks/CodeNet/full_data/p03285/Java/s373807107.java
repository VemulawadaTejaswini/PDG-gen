import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean flag = false;
		outside:for(int a=0;a<=N;a+=4){
			for(int b=0;b<=N;b+=7){
				if(a+b == N){
					flag = true;
					break outside;
				}
			}
		}

		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}
}