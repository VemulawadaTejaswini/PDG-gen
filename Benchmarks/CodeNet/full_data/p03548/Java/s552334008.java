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
    		ninzu++;

    		if(!(X>ninzu*Y+Z*(ninzu+1))){
    			break;
    		}


    	}

    	System.out.println(ninzu-1);

    }


}

