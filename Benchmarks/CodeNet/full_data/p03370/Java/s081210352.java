import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int X=sc.nextInt();

    	int[] M=new int[N];

    	int sum=0;

    	int min=9999;
    	for(int i=0;i<N;i++) {
    		int buf=sc.nextInt();

    		M[i]=buf;

    		sum+=buf;

    		if(min>buf) {
    			min=buf;
    		}

    	}

    	X-=sum;

    	int result=N+X/min;

    	System.out.println(result);
    }



}

