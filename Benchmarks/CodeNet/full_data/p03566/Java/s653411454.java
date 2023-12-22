
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    double[] T=new double[N];
	    double[] V=new double[N];
	    double[] V2=new double[N+1];
	    double[] V3=new double[N+1];
	    double[] vm=new double[N+1];
	    for (int i=0; i<N;i++) {
	    	T[i]=gd();
	    }
	    for (int i=0; i<N;i++) {
	    	V[i]=gd();
	    }
	    V2[0]=0;
	    V3[0]=0;
	    for (int i=1; i<N;i++) {
	    	V2[i]=Math.min(V[i-1], V[i]);
	    	V3[i]=Math.min(V[i-1], V[i]);
	    }
	    V2[N]=0;
	    V3[N]=0;

	    for (int i=1; i<N+1;i++) {
	    	if(V2[i]-V2[i-1] >T[i-1]) {
	    		V2[i]=V2[i-1]+T[i-1];
	    	} else if(V2[i-1]-V2[i] >T[i-1]) {
	    		V2[i-1]=V2[i]+T[i-1];
	    	}
	    }
	    for (int i=N-1; i>=0;i--) {
	    	if(V3[i]-V3[i+1] >T[i]) {
	    		V3[i]=V3[i+1]+T[i];
	    	} else if(V3[i+1]-V3[i] >T[i]) {
	    		V3[i+1]=V3[i]+T[i];
	    	}
	    }
	    for (int i=0; i<N+1;i++) {
	    	vm[i]=Math.min(V2[i], V3[i]);
	    }

	    double ans=0;
	    for (int i=0; i<N;i++) {
	    	if(2*V[i]-vm[i]-vm[i+1]<T[i]) {
	    		ans+=Math.pow(V[i]-vm[i], 2)/2 + Math.pow(V[i]-vm[i+1], 2)/2 + (V[i]-vm[i])*vm[i] + (V[i]-vm[i+1])*vm[i+1];
	    		ans+=(T[i] - 2*V[i]+vm[i]+vm[i+1]) * V[i];
	    	} else if(2*V[i]-vm[i]-vm[i+1]>=T[i]) {
	    		double x=(T[i]-Math.abs(vm[i+1]-vm[i]))/2;
	    		if(vm[i]>vm[i+1]) {
	    			ans+=Math.pow(x, 2)/2 + x*vm[i];
	    			ans+=Math.pow(x+vm[i]-vm[i+1], 2)/2 + vm[i+1]*(x+vm[i]-vm[i+1]);
	    		} else {
	    			ans+=Math.pow(x, 2)/2 + x*vm[i+1];
	    			ans+=Math.pow(x+vm[i+1]-vm[i], 2)/2 + vm[i]*(x+vm[i+1]-vm[i]);
	    		}
	    	}
	    }

        System.out.println(ans);
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}