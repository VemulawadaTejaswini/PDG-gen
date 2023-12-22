import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int sum_a = 0;
		int sum_b = 0;
		
		int[] a = new int[N];
		int[] b = new int[N];
		
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
			sum_a += a[i];
		}
		
		for(int i=0;i<N;i++){
			b[i] = sc.nextInt();
			sum_b += b[i];
		}
		
		int diff = sum_b - sum_a;

		if(match(diff,a,b))System.out.println("Yes");
		else System.out.println("No");
		
	}

	private static boolean match(int diff, int[] a, int[] b) {
		
		int N = a.length;
		boolean flag_a = false;
		boolean flag_b = false;
		int lower_limit = 0;
		
		for(int i=0;i<diff;i++){
			flag_a = false;
			flag_b = false;
			for(int j=lower_limit;j<N;j++){
				if(b[j]-a[j]==1&&!flag_a&&!flag_b){
					
					a[j]+=2;
					b[j]+=1;
					flag_a=true;
					flag_b=true;
					
				}else if(a[j]<b[j]&&!flag_a){
					
					a[j]+=2;
					flag_a=true;
					
				}else if(b[j]<a[j]&&!flag_b){
				
					b[j]+=1;
					flag_b=true;
				
				}else if(j==N-1){
					if(!flag_a){
						
						a[j]+=2;
						
					}else if(!flag_b){
						
						b[j]+=1;
						
					}
				}
				
				if(a[j]==b[j]&&j==lower_limit)	lower_limit++;
				
				if(flag_a&&flag_b) break;
					
			}

		}
		
		
		return lower_limit>=N ?true:false;
		
	}

}