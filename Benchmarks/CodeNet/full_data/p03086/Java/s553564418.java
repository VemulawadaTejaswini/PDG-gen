
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int N = c.length;
		int ans = 0;
		for(int i=0; i<N; i++){
			int tmp = 0;
			for(int j=i; j<N; j++){
				if(c[j] == 'A' || c[j] == 'T' || c[j] == 'C' || c[j] == 'G'){
					tmp++;
				}else{
					if(ans < tmp)ans = tmp;
					break;
				}
			}
		}
		
		System.out.println(ans);
		
		
		
		sc.close();
	}

	
}
