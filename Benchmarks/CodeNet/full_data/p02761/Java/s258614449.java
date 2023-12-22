import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[n+1];
		String ans = "";
		Arrays.fill(array, -1);
		//for(int i = 0; i<n+1; i++) System.out.println(array[i]);
		
		int[] s = new int[m];
		int[] c = new int[m];
		for(int i = 0; i<m; i++){
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		for(int k = 0; k<m; k++){
			if(array[s[k]] >= 0 && array[s[k]] != c[k]){
				ans = "-1";
				break;
			}
			array[s[k]] = c[k];
		}
		//System.out.println(s[2]);
		//for(int i = 1; i<n+1; i++)System.out.println(array[i]);
		
		if(ans.compareTo("-1") != 0){
			for(int i = 1; i<=n; i++){
				if(array[i] == -1){
					ans += "0";
					continue;
				}
				ans += String.valueOf(array[i]);
				
				
			}
		}	
		if(array[1] == 0 && n > 1){
			ans = "-1";
		}
		System.out.println(ans);
		
		sc.close();
	}



}