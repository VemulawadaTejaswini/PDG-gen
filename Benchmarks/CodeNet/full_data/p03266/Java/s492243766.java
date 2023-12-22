import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		if (N<=0 || K<0 || K>2*Math.pow(10,5)){
			System.out.println(0);
		}
		else
		{
			int count = 0;
			if(K%2==0){
				for(int a = 1 ; a <= N ; a++){
					if(a%K == K/2 || a%K == 0){
						count++;
					}
				}
			}
			else{
				for(int a = 1 ; a<=N;a++){
					if(a%K == 0){
						count++;
					}
				}	
				
			}
			System.out.println(count*count*count);
		}
		
	}

}