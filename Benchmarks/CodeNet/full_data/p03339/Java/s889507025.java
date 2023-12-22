import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dmp = Math.max(a+b, a-b);
		System.out.println(Math.max(dmp,a-b));
		*/
		//B
		/*
		int n = sc.nextInt();
		String s = sc.next();
		int[]ansdmp = new int[100];
		for(int i = 0 ; i < n ; i++){
			ansdmp[i]= 0;
			String s1 = s.substring(0,i);
			String s2 = s.substring(i,n);
			String s1sub = "";
			for(int j = 0 ; j < s1.length(); j++){
				if(s1sub.indexOf(s1.charAt(j)) == -1)
					s1sub+=s1.charAt(j);
			}
			//System.out.println(s1sub);
			String usedstr = "";
			for(int k = 0 ; k < s2.length(); k++){
				if (usedstr.indexOf(s2.charAt(k))== -1) {
					if (s1sub.indexOf(s2.charAt(k)) != -1) {
						ansdmp[i]++;
						usedstr += s2.charAt(k);
					}
				}
			}
			//System.out.println(ansdmp[i]);
		}
		int ans = 0;
		for(int x : ansdmp){
			ans = Math.max(ans,x);
		}
		System.out.println(ans);
		*/
		int n = sc.nextInt();
		String s = sc.next();
		/*
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++){
			int count = 0;
			for(int j = 0 ; j < i ; j++){
				if(s.charAt(j) != 'E')
					count++;
			}
			for(int k = i+1 ; k < n ; k++){
				if(s.charAt(k) != 'W')
					count++;
			}
			ans.add(count);
		}
		int a= ans.get(0);
		for(int x:ans){
			a =  Math.min(a, x);
		}
		System.out.println(a);
		*/
		//dp[i+1] = dp [i] || dp[i] + 1
		int[] dp = new int[n];
		for(int i = 0 ; i < n ; i++){
			if(i != 0 && s.charAt(0) == 'W')
				dp[0] = 1;
			else
				dp[0] = 0;
			for(int j = 1 ; j < n-1 ; j++){
				if(i > j){
					if(s.charAt(j) != 'E')
						dp[j] = dp[j-1]+1;
				}else if(i == j){
					dp[j] = dp[j-1];
				}else{
					if(s.charAt(j) != 'W')
						dp[j] = dp[j-1]+1;
				}
			}
			int tmp = 0;
			if(i != n-1 && s.charAt(n-1) == 'E')
				tmp = dp[n-2]+1;
			else
				tmp = dp[n-2];
			if(i > 0)
			dp[n-1] = Math.min(dp[n-1], tmp);
		}
		System.out.println(dp[n-1]);
	}
}
