import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
	int ans = 0;

	for (int i=0;i < 4;i++){
	    if (s.charAt(i) == '+'){
		ans++;
	    }
	    else{
		ans--;
	    }
	}
    	System.out.println(ans);
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = n;
	int s = 0;

	while(n != 0){
	    s += n%10;
	    n /= 10;
	}

	if (m%s == 0){
	    System.out.println("Yes");
	}
	else{
	    System.out.println("No");
	}
    }
}