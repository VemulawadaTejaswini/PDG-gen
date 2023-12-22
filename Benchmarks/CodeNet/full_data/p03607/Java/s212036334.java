import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 0;
		for(int i=0; i<n; i++){
			int p = 0;
			for(int j=i; j<n; j++){
				if(a[i]==a[j]){
					p++;
				}else{
					if(p%2==1)ans++;
					break;
				}
			}
          	i = i + p - 1;
		}
		System.out.println(ans);
	}
} 