import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n,num1,num2,num3;
		int cash;
		boolean check = false;
		n = stdIn.nextInt();
		cash = stdIn.nextInt();

		for(int i = 0; i <= n; i++){
			for(int j = 0; j <= n; j++){
				for(int k = 0; k <= n; k++){
					if(10000*i+5000*j+1000*k==cash && i+j+k==n){
						System.out.print(i+" "); 
						System.out.print(j+" ");
						System.out.println(k);
						check=true; 
						break;
					}
				}
				if(10000*i+5000*j==cash && i+j==n){
						System.out.print(i+" "); 
						System.out.print(j+" ");
						System.out.println(0);
						check=true; 
						break;
				}
			}
			if(10000*i==cash && i==n){
						System.out.print(i+" "); 
						System.out.print(0+" ");
						System.out.println(0);
						check=true; 
						break;
			}
		}
		if(check==false) {
			System.out.print(-1+" "); 
			System.out.print(-1+" "); 
			System.out.println(-1);
		
		}

	}
}