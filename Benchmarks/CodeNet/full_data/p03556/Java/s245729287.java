import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	for(int i=N;;i--) {

    		if(i*i<=N) {
    			System.out.println((i*i));
    			return;
    		}
    	}
    }


}

