import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);


    	int A=sc.nextInt();
    	int B=sc.nextInt();

    	if(A==B) {
    		System.out.println("-1");
    		return;
    	}

    	long index=1;
    	while(true) {

    		long divsor=A*index++;

    		if(divsor<=1000000000000000000l) {
	    		if((divsor)%B!=0) {
	    			System.out.println(divsor);
	    			return;
	    		}
    		}else {
    			System.out.println("-1");
    			return;
    		}
    	}

    }
}

