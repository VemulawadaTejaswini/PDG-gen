import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] color = new boolean[8];
		int tensai = 0;
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			if(a>=3200){
				tensai++;
			}else{
				color[a/400]=true;
			}
		}
		int ans = 0;
		for(int i=0; i<8; i++){
			if(color[i]) ans++;
		}
		
		if(ans==0){
			System.out.print(1+" ");
		}else{
			System.out.print(ans+" ");
		}
		
		System.out.println(ans+tensai);
		return;
	}
}