import java.util.*;

public class Main {
    public static void main(String[] args) {
	Main main = new Main();
	main.solveB();
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	int ans = 0;

	for(int i=0; i<n; i++){
	    int cnt = 0;
	    
	    for(char c='a'; c<='z'; c++){
		boolean left = false;
		boolean right = false;
		
		for(int j=0; j<i;j++){
		    if(s.charAt(j) == c) left = true;	    
		}
		for(int k=i+1; k<n;k++){
		    if(s.charAt(k) == c) right = true;	    
		}
		if(left && right) cnt ++;
	    }
	    ans = Math.max(ans,cnt);
	}
	System.out.println(ans);
    }
}
