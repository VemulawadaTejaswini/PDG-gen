import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int X=sc.nextInt();
    	int Y=sc.nextInt();
    	int Z=sc.nextInt();

    	int ninzu=0;
    	while(true) {

    		int next=ninzu+1;
    		if(X>=next*Y+Z*(next+1)) {
    			ninzu=next;
    		}else {
    			break;
    		}


    	}

    	System.out.println(ninzu);

    }


}

