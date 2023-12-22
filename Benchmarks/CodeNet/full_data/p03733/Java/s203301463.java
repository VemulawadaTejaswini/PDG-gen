import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	int t = sc.nextInt();
      	//配列
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
        int ans = t;
        for(int i = 1; i < n; i++){
        	if(num[i]-num[i-1]<=t){
            	ans += num[i]-num[i-1];
            }else{
              	ans = t+ans;
            }
        }
        System.out.println(ans);
     }
}