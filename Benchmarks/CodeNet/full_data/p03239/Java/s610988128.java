import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int t=sc.nextInt();
		int c[]=new int [n];
		int tl[]=new int [n];

		for(int i=0;i<n;i++){
			c[i]=sc.nextInt();
			tl[i]=sc.nextInt();
		}

		int min=10000;

		for(int i=0;i<n;i++){
			if(t>=tl[i]){
				if(min>c[i]){
					min=c[i];
				}
			}
		}

		if(min==10000){
			System.out.println("TLE");
		}else{
			System.out.println(min);

		}


	}

}
