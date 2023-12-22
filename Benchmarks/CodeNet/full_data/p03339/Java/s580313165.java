import java.util.*;

public class Main {
    public static void main(String[] args) {
	Main main = new Main();
	main.solveC();
    }
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	int[] dpw = new int[n];
	int[] dpe = new int[n];

	if (s.charAt(0) == 'W'){
	    dpw[0] = 1;
	}
	else{
	    dpw[0] = 0;
	}	
	for(int i=1; i<n; i++){
	    if (s.charAt(i) == 'W'){
		dpw[i] = dpw[i-1] + 1;
	    }
	    else{
		dpw[i] = dpw[i-1];
	    }
	}

	if (s.charAt(n-1) == 'E'){
	    dpe[n-1] = 1;
	}
	else{
	    dpe[n-1] = 0;
	}	
	for(int i=n-2; i>=0; i--){
	    if (s.charAt(i) == 'E'){
		dpe[i] = dpe[i+1] + 1;
	    }
	    else{
		dpe[i] = dpe[i+1];
	    }
	}
	
	int ans = 1000000;
	for(int i=0; i<n; i++){
	    ans = Math.min(ans,dpw[i] + dpe[i] - 1);
	}	
	System.out.println(ans);
    }
}
