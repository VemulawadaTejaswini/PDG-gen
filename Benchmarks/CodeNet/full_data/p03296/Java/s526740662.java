import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveA();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int p = 0;
	int ans = 0;

	for (int i=0;i < n;i++){
	    int a = sc.nextInt();
	    if (a==p){
		p = 0;
		ans++;
	    }
	    else p = a;
	}
    	System.out.println(ans);
    }
}
