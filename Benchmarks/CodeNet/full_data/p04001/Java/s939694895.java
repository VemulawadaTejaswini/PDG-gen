import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		int gyoukan=str.length()-1;
		
		
		long ans=0;
		
		for(int bit=0;bit<(1<<gyoukan);bit++) {
			
			long sum=0;
			long a=str.charAt(0)-'0';
			
			
			for(int pointer=0;pointer<gyoukan;pointer++) {
				
				//○桁目にビットが立ってるかどうか。
				if((bit>>pointer)%2==1) {
					
					sum+=a;
					a=0;
					
				}
				
				a=a*10+(str.charAt(pointer+1)-'0');
				
			}
			
			sum+=a;
			
			ans+=sum;
			
		}

		System.out.println(ans);
		

	}




}



