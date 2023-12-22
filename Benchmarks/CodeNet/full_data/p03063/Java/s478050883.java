

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		char[] stone = sc.next().toCharArray();
		
		int count = 0;
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			if(stone[i]=='.')count++;
		}
		
		for(int i=0;i<N;i++){
			if(stone[i]=='.'){
				count--;
			}else{
				count++;
			}
			ans = Math.min(ans,count);
		}

		System.out.println(ans);
		
		sc.close();
	}
	
}
