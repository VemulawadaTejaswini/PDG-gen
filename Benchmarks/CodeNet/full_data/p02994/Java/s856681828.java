import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = b;
		int sum = b;
		for(int i = 1; i < a; i++){
		    int cost = b + i;
		    sum += cost;
		    if(post(ans) > post(cost)){
		        ans = cost;
		    }
		}
		System.out.println(sum - ans);
	}
	
	public static int post(int a){
	    if(a < 0){
	        return -a;
	    }else{
	        return a;
	    }
	}
}