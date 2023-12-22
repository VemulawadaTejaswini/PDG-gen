import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int k = sc.nextInt();
		String[] part = new String[n*k];
		Arrays.fill(part, "|");
		int cnt = 0;
		for(int i=1; i<=Math.min(k, n); i++){
			for(int j=0; j<n-i+1; j++){
				part[cnt] = s.substring(j, j+i);
				cnt++;
			}
		}
		Arrays.sort(part);
		int count = 0;
		String ans = "";
		for(int i=0; i<n*k; i++){
			if(!ans.equals(part[i])){
				ans = part[i];
				count++;
			}
			if(count==k)break;
		}
		System.out.println(ans);
	}
}