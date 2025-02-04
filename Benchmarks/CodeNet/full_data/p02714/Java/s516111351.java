import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long rc = 0;
		long gc = 0;
		long bc = 0;
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
		for(int i=1; i<=n; i++){
			for(int k=i+1; k<=n; k++){
				if((i+k)%2 == 0){
					char is = s.charAt(i-1);
					char ks = s.charAt(k-1);
					char js = s.charAt(((i+k)/2)-1);
					if(is != ks && ks != js && js != is){
						result--;
					}
				}
			}
		}
		System.out.println(result);
	}
}
