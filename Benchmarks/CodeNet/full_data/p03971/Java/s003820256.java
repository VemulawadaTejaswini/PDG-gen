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

    	String[] s=sc.next().split("");

    	int passer=0;
    	int passerfore=1;

    	for(int i=0;i<s.length;i++) {

    		String syozoku=s[i];


    		if(syozoku.equals("a")) {
    			if(passer<A+B) {
    				System.out.println("Yes");
    				passer++;
    			}else {
    				System.out.println("No");
    			}
    		}else if(syozoku.equals("b")) {
    			if(passer<A+B && passerfore<=B) {
    				System.out.println("Yes");
    				passerfore++;
    				passer++;
    			}else {
    				System.out.println("No");
    			}

    		}else {
    			System.out.println("No");
    		}

    	}
    }

}

