import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x[] = new int[n], y[] = new int[n];
		
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int parity = Math.abs((x[0] + y[0]) % 2);
		
		boolean f = true;
		for(int i=1;i<n;i++){
			if(Math.abs((x[i]+y[i])%2) != parity)
				f = false;
		}
		
		if(f){
			int a[] = new int[31];
			
			a[0] = 1;
			for(int i=1;i<31;i++){
				a[i] = a[i-1]*2;
			}
			
			
			if(parity==0){
				System.out.println(32);
				System.out.print(1+" ");
			}
			else{
				System.out.println(31);
			}
			
			for(int i=30;i>=0;i--){
				System.out.print(i==30 ? a[i]:" "+a[i]);
			}
			System.out.println();
			
			
			for(int i=0;i<n;i++){
				if(parity==0){
					if(Math.abs(x[i]-1) + Math.abs(y[i]) <= (1L<<31) -1){
						x[i] -= 1;
						System.out.print("R");
					}
					else if(Math.abs(x[i]+1) + Math.abs(y[i]) <= (1L<<31) -1){
						x[i] += 1;
						System.out.print("L");
					}
					else if(Math.abs(x[i]) + Math.abs(y[i]-1) <= (1L<<31) -1){
						y[i] -=1;
						System.out.print("U");
					}
					else{
						y[i]+=1;
						System.out.print("D");
					}
				}
				
				
				for(int j=30;j>=0;j--){
					
					if(Math.abs(x[i]-a[j]) + Math.abs(y[i]) <= (1L<<j) -1){
						x[i] -= a[j];
						System.out.print("R");
					}
					else if(Math.abs(x[i]+a[j]) + Math.abs(y[i]) <= (1L<<j) -1){
						x[i] += a[j];
						System.out.print("L");
					}
					else if(Math.abs(x[i]) + Math.abs(y[i]-a[j]) <= (1L<<j) -1){
						y[i] -= a[j];
						System.out.print("U");
					}
					else{
						y[i] += a[j];
						System.out.print("D");
					}
				}
				System.out.println();
			}
			
		}
		else{
			System.out.println(-1);
		}
	}

}
