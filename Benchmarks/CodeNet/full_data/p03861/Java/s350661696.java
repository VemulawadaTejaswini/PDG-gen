import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	long a=sc.nextLong();
    	long b=sc.nextLong();
    	long x=sc.nextLong();

    	long cnt=0;
    	for(long i=a;i<=b;i++) {

    		if(i%x==0) {
    			cnt++;
    		}

    	}

    	System.out.println(cnt);

    }
}

