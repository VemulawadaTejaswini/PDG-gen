import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	Long[] L=new Long[N+1];

    	L[0]=2l;
    	L[1]=1l;

    	for(int i=2;i<L.length;i++) {
    		L[i]=L[i-1]+L[i-2];
    	}

    	System.out.println(L[N]);

    }


}

