import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int sum =0;

		for(int i=1; i<=k; i++){
			for(int j=1; j<=k; j++){
				for(int l=1; l<=k; l++){
					for(int x =200; x>=1; x--){
						if(i%x==0 && j%x==0 && l%x==0){
							sum += x;
                          	break;
						}
					}
				}
			}
		}
		System.out.println(sum);
		
	}
}