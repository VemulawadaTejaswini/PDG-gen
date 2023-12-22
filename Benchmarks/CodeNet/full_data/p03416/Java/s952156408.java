import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int A=sc.nextInt();
    	int B=sc.nextInt();


    	int counter=0;
    	for(int i=A;i<=B;i++) {

    		if(Judge(i)) {
    			counter++;
    		}

    	}

    	System.out.println(counter);


    }

    public static boolean Judge(int X) {

    	String str=String.valueOf(X);
    	String[] S=str.split("");

    	for(int i=0;i<S.length/2;i++) {

    		if(!S[i].equals(S[S.length-1-i])) {
    			return false;
    		}

    	}

    	return true;
    }



}

