import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n,i,cnt = 1;
		n = sc.nextInt();
		
		System.out.println(sum(n,0,100000));
		
	}
	public static int sum(int n,int cnt,int min){
		int six = 6,nine = 9;
		int tmp;
		if(cnt > min){
			return 100000;
		}
		if(n < 6){
			return cnt + n;
		}
		
		while(six <= n){
			six *= 6;
		}
		six /= 6;
		
		tmp = sum(n - six,cnt + 1,min);
		if(tmp < min){
			min = tmp;
		}

		while(nine <= n){
			nine *= 9;
		}
		nine /= 9;
		
		tmp = sum(n - nine,cnt + 1,min);
		if(tmp < min){
			min = tmp;
		}

		return min;
	}
}