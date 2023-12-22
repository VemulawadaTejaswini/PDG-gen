

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		sc.close();
		
		int ans=0;
		for (int i=0; i<N; i++){
			
			int count=0;
			
			for (char c='a'; c<='z'; c++){
				boolean left=false;
				boolean right=false;
				
				for (int j=0; j<i; j++){
					if (s.charAt(j)==c)
						left=true;
				}
				
				for (int j=i; j<N; j++){
					if (s.charAt(j)==c)
						right=true;
				}
				
				if (left==true && right==true)
					count++;
				
			}
			
			ans = Math.max(ans, count);
			
		}
		System.out.println(ans);
	}

}
