import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	long x = sc.nextLong();
    	long ax = a/x;
    	long amx = a%x;
    	long bx = b/x;
    	long bmx = b%x;
    	if(amx==0){
        	System.out.println(bx-ax+1);
    	}else{
        	System.out.println(bx-ax);
    	}
    }
}