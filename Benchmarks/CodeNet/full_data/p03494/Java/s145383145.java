import java.util.*;
class Main
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] param1 = new int[n];
			
			for(int i=0 ; i<n ; i++){
				
				param1[i] = sc.nextInt();
				
			}
			
			int res = 0;
			
			while(true){
			
			int sum = 0;
			
			for(int i=0 ; i<n ; i++){
			
			if(param1[i]%2==0){
				sum++;
			}else{
				System.out.println(res);
				return;
			}
			
			}
			
			if(sum==n){
				for(int i=0 ; i<n ; i++){
					param1[i]/=2;
				}
			}
			res++;
			}
		}
}