import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveC();
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
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] a = new int[n];
	
	for(int i=0; i < n; i++){
	    a[i] = sc.nextInt();
	}

	n--;
	k--;
	int cnt = 0;
	while(n>0){
	    n -=k;
	    cnt++;
	}

	System.out.println(cnt);
    }
}