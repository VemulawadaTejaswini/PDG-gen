import java.math.BigInteger;
import java.util.*;

import library.Other.Edge;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b % a == 0){
				System.out.println(a + b);
			}
			else{
				System.out.println(b - a);
			}
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
