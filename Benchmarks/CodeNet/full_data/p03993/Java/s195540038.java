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

    	int ans=0;
    	for(int i=0;i<N;i++) {
    		if(A[A[i]]==i) {
    			ans++;
    		}
    	}

    	System.out.println(ans/2);

    }

}

