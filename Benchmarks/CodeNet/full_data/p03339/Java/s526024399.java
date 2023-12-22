import java.util.*;

class Main { 
	public static void main(String arts[]) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int begin = 0; //0番目を選んだときのスコアを格納しておく
		for(int i = 1 ; i < n ; i ++){
			if(s.charAt(i)=='E'){
				begin ++;
			}
		}
		int ans = begin;
		int now = begin ;
		for(int i = 1; i < n ; i++){
			if(s.charAt(i-1)=='W') now++;
			if(s.charAt(i)=='E') now--;
			if(ans>now){
				ans = now;
			}
		}	
		System.out.println(ans);
	} 
} 


