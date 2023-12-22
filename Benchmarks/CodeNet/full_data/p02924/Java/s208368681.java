import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []moto=new int[n];
		int []sort=new int[n];
		int count=1;
		int goukei=0;
		for(int i=0;i<n;i++){
			moto[i]=count;
		}
		for(int i=0;i<n;i++){
			sort[i]=moto[n-(i+1)];
		}
		for(int i=0;i<n;i++){
			goukei+=moto[i]%sort[i];
		}
		System.out.println(goukei);
	}
}