import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int rc = 0;
		int gc = 0;
		int bc = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				rc++;
			} else if(s.charAt(i) == 'G'){
				gc++;
			} else {
				bc++;
			}
		}
		long result = rc*gc*bc;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				int k = 2*j-i;
				if(k<n) {
					char is = s.charAt(i);
					char js = s.charAt(j);
					char ks = s.charAt(k);
					if(	is != ks && ks != js && js != is){
						result--;
					}
				}
			}
		}
		System.out.println(result);
	}
}
