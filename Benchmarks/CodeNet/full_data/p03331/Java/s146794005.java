import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	int A=0;
    	int B=0;
    	int min=99999999;
    	for(int i=1;i<N;i++) {
    		A=i;
    		B=N-A;

    		if(min>getdigitsum(A)+getdigitsum(B)) {
    			min=getdigitsum(A)+getdigitsum(B);
    		}
    	}

    	System.out.println(min);


    }

    public static int getdigitsum(int d) {
    	int result=0;
    	while(d>0) {
    		result+=d%10;
    		d/=10;
    	}

    	return result;
    }
}
