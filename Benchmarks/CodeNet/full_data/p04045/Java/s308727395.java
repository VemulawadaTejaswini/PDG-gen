import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        String str = "";
	        for(int i = 0; i < k; i++) {
	        	str = str + sc.next();
	        }
	        for(int i = n; i <= 10000; i++ ) {
	        	if(check(i,str)) {
	        		System.out.print(i);
	        		sc.close();
	        		return;
	        	}
	        }
	        sc.close();
		}
		private static boolean check(int n, String str){
			boolean result = true;
			String m;
			while(n >= 1) {
				m = String.valueOf(n % 10);
				int comp = str.indexOf(m);
				if(comp != -1) {
					result = false;
				}
				n = n / 10;
			}
			return result;
    }
}