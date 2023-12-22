import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		int N=scan.nextInt();
		int A=scan.nextInt();
		int B=scan.nextInt();
		
		if(N<=0){
			System.out.println(0);
		}else{
			if(N==1){
				if(A!=B){
					System.out.println(0);
				}else{
					System.out.println(1);
				}
			}else if(N>2){
				if(A>B){
					System.out.println(0);
				}else{
					if(B-A>=2){
						System.out.println((N-2)*((B-A))+1);
					}else if(B-A==1){
						System.out.println(N-1);
					}else{
						System.out.println(1);
					}
				}
			}else{
				if(A>B){
					System.out.println(0);
				}else{
					System.out.println(1);
				}
			}
		}
	}
}