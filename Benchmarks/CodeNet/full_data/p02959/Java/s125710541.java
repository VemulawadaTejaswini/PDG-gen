import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] monsArr = new int[n+1];
		for(int i =0;i<monsArr.length;i++){
			monsArr[i]= scan.nextInt();
		}
		int[] heroArr = new int[n];
		for(int i =0;i<heroArr.length;i++){
			heroArr[i]= scan.nextInt();
		}
		int sum=0;
		for(int i=n-1;i>=0;i--){
			if (heroArr[i] > monsArr[i+1]) {
				heroArr[i]-=monsArr[i+1];
				sum+=monsArr[i+1];
				monsArr[i+1]=0;
				if (heroArr[i] > monsArr[i]) {
					heroArr[i]-=monsArr[i];
					sum+=monsArr[i];
					monsArr[i+1]=0;
				}else{
					monsArr[i]-=heroArr[i];
					sum+=heroArr[i];
					heroArr[i]=0;
				}
			}else{
				monsArr[i+1]-=heroArr[i];
				sum+=heroArr[i];
				heroArr[i]=0;
			}

		}
		System.out.println(sum);
	}
}
