import java.time.Instant;
import java.util.*;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();

		System.out.println((A*3 + P) /2 );



	}

	static class Pair<T1, T2>   {
		int n;
	    T1 a;
	    T2 b;
	    public Pair(int n, T1 a,T2 b) {
	        this.n = n;
	    	this.a = a;
	        this.b = b;
	    }

	    T1 getA(){
	    	return a;
	    }

	    T2 getB(){
	    	return b;
	    }

	}
}


