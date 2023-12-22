import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int K=sc.nextInt();

    	int result=1;

    	for(int i=0;i<N;i++) {

    		if(result<=K) {
    			result+=result;
    		}else {
    			result+=K;
    		}

    	}

    	System.out.println(result);
    }







}

