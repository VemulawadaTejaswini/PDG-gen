import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=0; i<=n/r; i++){
			for(int j=0; j<=(n-i*r)/g; j++){
				for(int k=0; k<=(n-i*r-j+g)/b; k++){
					if(r*i+g*j+b*k == n){
						ans++;
						break;
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}
