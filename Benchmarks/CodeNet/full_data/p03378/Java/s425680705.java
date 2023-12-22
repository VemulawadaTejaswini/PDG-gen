import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int M=sc.nextInt();
    	int X=sc.nextInt();

    	int[] A=new int[M];

    	for(int i=0;i<M;i++) {
    		A[i]=sc.nextInt();
    	}

    	int counter=0;
    	for(int i=0;i<M;i++) {
    		if(X>A[i]) {
    			counter++;
    		}else {
    			break;
    		}
    	}

    	int cost=Math.min(counter,A.length-counter);

    	System.out.println(cost);


    }



}

