import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int c[] = new int[n];
		int tn[] = new int[n];
		int cm=1001,tm=1001;
		for(int i= 0;i<n;i++){
			c[i]=sc.nextInt();
			tn[i]=sc.nextInt();
			if(cm>c[i]&&t>=tn[i]){
				cm=c[i];
				tm=tn[i];
			}

		}
		if(tm==1001){
			System.out.println("TLE");
		}else{
			System.out.println(cm);
		}
	}
}
