import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();

		int flag=0;
		loop: for (int a=0;a<N+1;a++) {
			for (int b=0;b<N+1;b++) {
				if ((Y-10000*a-5000*b)==1000*(N-a-b) && (N-a-b)>=0) {
					System.out.println(a+" "+b+" "+(N-a-b));
					flag=1;
					break loop;
				}
			}
		}

		if(flag==0) {
			System.out.println((-1)+" "+(-1)+" "+(-1));
		}
	}
}