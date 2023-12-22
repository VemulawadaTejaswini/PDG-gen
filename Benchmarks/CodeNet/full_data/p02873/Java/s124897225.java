import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int n = s.length;
		int[] value = new int[n + 1];
		for (int i = 0 ; i < n + 1 ; i++) {
			value[i] = 0;
		}
		
		rightWrite(s, value, 0, n);
		
		for(int i = 1 ; i < n ; i++) {
			if(s[i].equals("<")) {
				leftWrite(s, value, i -1);
				i = rightWrite(s, value, i, n);
			}
		}
		
		leftWrite(s, value, n -1);
		
		long ans= 0 ;
		for (int i = 0 ; i < n + 1 ; i++ ) {
			 ans +=value[i];
		}
		System.out.println(ans);
	}

	public static int rightWrite(String s[],int[] value , int i ,int n){

		int cnt = 1;
		while(i < n && s[i] .equals("<")) {
			if(value[i + 1] < cnt ) {
				value[i + 1] = cnt;
			}
			i++;
			cnt++;
		}
		
		
		return i;
	}
	
	public static void leftWrite(String s[],int[] value , int i){

		int cnt = 1;
		while(i >= 0 && s[i].equals(">")) {
			if(value[i] < cnt ) {
				value[i] = cnt;
			}
			i--;
			cnt++;
		}
	}
	
	
}
