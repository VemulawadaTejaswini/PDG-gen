import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int s=sc.nextInt();
		int x,y,z;
		int sum=0;
		
		for(int i=k+1;i>0;i--)sum+=i;
		System.out.println(sum);
	}

}
