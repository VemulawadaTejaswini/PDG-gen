import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int N;
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
		if (N>=1||N<=81 ){
				for(int i=0; i<9; i++) {
					int m = i+i;
					int f= N%m;
					if (f==0){
						int a= N/m;
						System.out.println("Yes");
						break;
					}
					else
					System.out.print("No");
				}


			}
		else
			System.out.print("No");

	}
}