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

    	int sum=K*X+(N-K)*Y;

    	System.out.println(sum);
    }
}
