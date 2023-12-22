import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	int[] A=new int[N];

    	for(int i=0;i<N;i++) {
    		A[i]=sc.nextInt()-1;
    	}

    	int pointLast=A[0];
    	int pointNow;
    	A[0]=-1;

    	int counter=1;
    	while(true) {

    		pointNow=A[pointLast];
    		A[pointLast]=-1;

    		if(pointNow!=-1) {
    			pointLast=pointNow;
    			counter++;

    			if(pointNow==1) {
    				break;
    			}

    		}else {
    			counter=-1;
    			break;
    		}



    	}

    	System.out.println(counter);


    }

}

