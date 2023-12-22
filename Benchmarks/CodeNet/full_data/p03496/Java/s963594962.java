import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int max = 1;
		int a[] = new int[n+1];
		
		int cnt = 0;
		for(int i=1;i<=n;i++){
			a[i] = sc.nextInt();
			if(i>1 && a[i]<a[i-1])
				cnt++;
			if(Math.abs(a[i]) > Math.abs(a[max])){
				max = i;
			}
		}
		
		if(a[max] == 0){
			System.out.println(0);
		}
		else{
			System.out.println(n+cnt);
			System.out.println(max+" "+max);
			for(int i=1;i<=n;i++){
				if(i!=max){
					System.out.println(max+" "+i);
				}
			}
			
			if(a[max] > 0){
				for(int i=1;i<n;i++){
					if(a[i] > a[i+1]){
						System.out.println(i+" "+(i+1));
					}
				}
			}
			else{
				for(int i=n;i>1;i--){
					if(a[i-1] > a[i]){
						System.out.println(i+" "+(i-1));
					}
				}
			}
		}
	}

}
