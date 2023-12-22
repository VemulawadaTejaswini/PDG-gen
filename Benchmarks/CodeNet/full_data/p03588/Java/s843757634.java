import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();

    	int[][] data=new int[N][2];

    	for(int i=0;i<N;i++) {
    		data[i][0]=sc.nextInt();
    		data[i][1]=sc.nextInt();
    	}

    	int max=-1;
    	int indexMAX=-1;
    	int min=data[0][1];
    	int indexMIN=-1;

    	for(int i=0;i<N;i++) {

    		int buf=data[i][1];

    		if(max<buf) {
    			max=buf;
    			indexMAX=i;
    		}

    		if(min>buf) {
    			min=buf;
    			indexMIN=i;
    		}
    	}

    	int result=indexMIN+min;

    	System.out.println(result);

    }

}

