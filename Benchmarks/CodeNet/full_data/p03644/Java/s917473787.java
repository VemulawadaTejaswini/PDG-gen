import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int maxcount=0;
		int max=0;
		
		
		for(int i = 1;i<=N;i++){
			int shou=i/2;
			int amari=i%2;
			int dasshu = 0;
			
			maxcount=0;
			
			do{
				
				
				
				if(amari==0&&shou==1){//割り切れたが最後の2だった
					maxcount+=1;
					dasshu=1;
				}else if(amari==0&&shou!=1){//2で割れた時だけ繰り返す
					
					shou = shou/2;
					amari = amari%2;
					maxcount+=1;
				}else if(amari !=0){//割り切れなくても脱出
					dasshu=1;
					
				}
			
				
			}while(dasshu==0);
			
			if(max<maxcount){
				max = maxcount;
			}
			
			
		}
		
		
		
		System.out.println((int)Math.pow(2, max));
		
		
		
		
		
	}

}
