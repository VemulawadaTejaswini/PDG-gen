import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String forecast = sc.next();
		String result = sc.next();
		int ans = 0;
		for(int i = 0; i < 3; i++) {
			if(forecast.charAt(i) == result.charAt(i)) ans++;
		}
		System.out.println(ans);
	}
}


