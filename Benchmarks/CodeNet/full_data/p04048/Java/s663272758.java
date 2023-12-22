import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new B().doIt();
    }
    class B{
    	void doIt(){
    		long N = sc.nextLong();
    		long X = sc.nextLong();
    		long XX = X * 2;
    		if(N - XX < 0)X = N - X;
    		long NN = N - X;
//    		System.out.println(NN+" "+X);
    		if(X == 0){
    			X = NN;
    			NN = 0;
    		}
    		long pa = NN % X;
    		long sum = NN * (3+pa);
    		System.out.println(sum);
    	}
    }
}