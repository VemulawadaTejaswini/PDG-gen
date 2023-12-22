import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = 0;
		int odd = 0;
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			a = sc.nextLong();
			if( a%2 != 0 ){
				odd++;
			}
		}
		if( odd%2 == 0 ){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		return;
	}
}