import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int A=sc.nextInt();
    	int B=sc.nextInt();

    	if(A>B || (N==1 && A!=B)) {
    		System.out.println("0");
    		return;
    	}

    	int lowbound=(N-1)*A+B;
    	int upeerbound=A+(N-1)*B;

    	int result=upeerbound-lowbound+1;

    	System.out.println(result);
    }


}

