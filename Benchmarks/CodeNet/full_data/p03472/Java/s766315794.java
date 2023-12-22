import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double hp = sc.nextInt();
		double a = 0;
		Integer b[] = new Integer [n];
		for(int i = 0; i < n ; i++){
			int tmp = sc.nextInt();
			if( tmp > a){
				a = tmp;
			}
			b[i] = sc.nextInt();
		}
		/*for( int i = n; i > 0; i--){
			for( int j = 0; j < i - 1 ; j++ ){
				if(b[j] < b[j+1]){
					int tmp = b[j];
					b[j] = b[j+1];
					b[j+1] = tmp;
				}
			}
		}*/
		Arrays.sort(b,Collections.reverseOrder());
		int ans = 0;
		int index = 0;
		while( hp > 0){
			if( index < n && b[index] >= a ){
				hp -= b[index];
				ans++;
				index++;
			}else{
				break;
			}
		}
		/*if(hp%a == 0){
			ans += hp/a;
		}else{
			Double tmpA = hp/a;
			int tmpB = tmpA.intValue();
			if(tmpA - tmpB < 0){
				ans += tmpB;
			}else{
				ans += tmpB + 1;
			}
		}*/
		ans+= (int) ((hp+a-1)/a);
		System.out.print(ans);
	}
}
