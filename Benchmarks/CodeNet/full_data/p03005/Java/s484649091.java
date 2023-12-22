


import java.util.Scanner;;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		
		int max=N-(K-1);
		int min=1;
		
		if(K==1) {
			System.out.println(0);
		}else {
			System.out.println(max-min);
		}
		
		
		
		
		
		
		
	}

	
}
		