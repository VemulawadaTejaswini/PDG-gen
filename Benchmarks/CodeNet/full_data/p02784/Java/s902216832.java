import java.util.Scanner;

public class RaccoonVsMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int n= sc.nextInt();
		int sum=0;
		for(int i =0 ;i< n; i++)
			sum+=sc.nextInt();
		if(H-sum>0)System.out.println("No");
		else System.out.println("Yes");

	}

}