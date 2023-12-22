import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
 
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
	int cnt = 1;
	
	if(n > 1){
    	for(int i=1; i<n; i++){
	        if(s.charAt(i) != s.charAt(i-1)){
	            cnt++;
	        }
	    }
	}
	
		System.out.println(cnt);
		sc.close();
    }
}