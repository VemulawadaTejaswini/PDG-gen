import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int H=sc.nextInt();
    	int W=sc.nextInt();

    	for(int i=0;i<W+2;i++) {
    		System.out.print("#");
    	}
    	System.out.println();

    	for(int i=0;i<H;i++) {

    		System.out.print("#");
    		System.out.print(sc.next());
    		System.out.println("#");

    	}

    	for(int i=0;i<W+2;i++) {
    		System.out.print("#");
    	}
    	System.out.println();

    }

}

