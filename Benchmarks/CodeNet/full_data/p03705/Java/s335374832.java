import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
    public void run() throws Exception {
    	//StringBuilder sb = new StringBuilder();

    	int n1 = sc.nextInt();
    	int n2 = sc.nextInt();
    	int n3 = sc.nextInt();
    	long anw = 0;
    	if(n2 > n3){
    		System.out.println(anw);
    		return;
    	}

    	if(n1 == 1){
    		if (n2 == n3){
            	anw = 1;
    		}else {
    			anw = 0;
    		}
    	}else if (n1 == 2){
    		anw = 1;
    	}else {
        	long min = (long) n2*(n1-1) + (long) n3;
        	long max = (long) n3*(n1-1) + (long) n2;
        	anw = max - min + 1;
    	}
    	System.out.println(anw);
    }
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}