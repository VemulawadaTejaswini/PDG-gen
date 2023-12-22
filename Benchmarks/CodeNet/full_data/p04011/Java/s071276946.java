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
    	int X=sc.nextInt();
    	int Y=sc.nextInt();

    	int result=0;
    	if(N-K>0) {
    		result=(N-K)*Y+K*X;
    	}else {
    		result=N*X;
    	}

    	System.out.println(result);
    }
}
