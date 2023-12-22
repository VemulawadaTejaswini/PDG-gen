import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int counterfive=0;
    	int counterseven=0;

    	for(int i=0;i<3;i++) {

    		int buf=sc.nextInt();

    		if(buf==5) {
    			counterfive++;
    		}else if(buf==7) {
    			counterseven++;
    		}

    	}

    	if(counterfive==2 && counterseven==1) {
    		System.out.println("YES");
    	}else {
    		System.out.println("NO");
    	}

    }
}
