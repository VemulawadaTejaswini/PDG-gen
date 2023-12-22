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

    	Long mult=a;
    	for(Long i=a+1;i<=b;i++) {
    		mult*=i;
    	}

    	if(mult>0) {
    		System.out.println("Positive");
    	}else if(mult<0) {
    		System.out.println("Negative");
    	}else {
    		System.out.println("Zero");
    	}

    }


}

