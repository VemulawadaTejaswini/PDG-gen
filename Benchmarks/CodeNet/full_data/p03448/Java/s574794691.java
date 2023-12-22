import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);


    	int x500=scanner.nextInt();
    	int x100=scanner.nextInt();
    	int x50=scanner.nextInt();
    	int target=scanner.nextInt();


    	int result=0;
    	for(int i=0;i<=x500;i++) {

    		for(int j=0;j<=x100;j++) {

    			for(int k=0;k<=x50;k++) {

    				if(target==(500*i+100*j+50*k)){
    					result++;
    				}


    			}

    		}
    	}

    	System.out.println(result);

    	scanner.close();


    }

}