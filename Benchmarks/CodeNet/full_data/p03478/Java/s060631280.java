import java.util.*;
class Main
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int sum = 0;
			
			for(int i=1 ; i<=n ; i++){
				
				int num = 0;
				
				if(i<10){
					num = i;
				}else if(10<=i&&i<100){
					num+=(i%10)+((i/10)%10);
				}else if(100<=i&&i<1000){
					num+=(i%10)+((i/10)%10)+(((i/100)%10));
				}
					
					
				
				if ( (a<=num) && (num<=b) ){
					sum += i;
				}
			}
			System.out.println(sum);
		}
}