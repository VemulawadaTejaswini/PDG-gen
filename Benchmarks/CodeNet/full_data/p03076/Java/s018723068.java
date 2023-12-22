import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		int difMax=0;
		for(int i=0;i<5;i++) {
			int a=sc.nextInt();
			int b=(a+9)/10*10;
			ans+=b;
			int dif=b-a;
			if(difMax<dif) {
				difMax=dif;
			}
		}

		System.out.println(ans-difMax);
	}
}