import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveC();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	String s;
	if (A>=9 || B>=9){
	    s = ":(";
	}
	else{
	    s = "Yay!";
	}
    	System.out.println(s);
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int D = sc.nextInt();
    	int N = sc.nextInt();
	int p = 1;
	
	for (int i=0;i < D;i++){
	    p *=100;
	}	
	
	System.out.println(p*N);
    }
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long[] a = new long[n];
	
	for(int i=0; i < n; i++){
	    a[i] = sc.nextLong();
	}

	int cnt = 0;

	for(int i=0; i < n; i++){
	    if(a[i]%2 == 0){		
		while(a[i]%2 ==0){
		    a[i]/=2;
		    cnt++;
		}
	    }
	}

	System.out.println(cnt);
    }
}