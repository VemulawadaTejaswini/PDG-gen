import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    String op1 = "";
	    String op2 = "";
	    String op3 = "";

	    loop: for (int i = -1; i <= 1; i +=2) {
	    	int tmp_answer = 0;
	    	 for (int j = -1; j <= 1; j +=2) {
	    		 for (int k = -1; k <= 1; k +=2) {
	    			 tmp_answer = a + b * i + c * j + d * k;
	    			 if (tmp_answer == 7) {

	    				 if (i == -1) {
	    					 op1 = "-";
	    				 }
	    				 else {
	    					 op1 = "+";
	    				 }

	    				 if (j == -1) {
	    					 op2 = "-";
	    				 }
	    				 else {
	    					 op2 = "+";
	    				 }

	    				 if (k == -1) {
	    					 op3 = "-";
	    				 }
	    				 else {
	    					 op3 = "+";
	    				 }

	    				 break loop;
	    			 }
	    		 }
	    	 }
	    }
	    System.out.println(String.valueOf(a) + op1 + String.valueOf(b) + op2 + String.valueOf(c) + op3 + String.valueOf(d) + "=7");
	}
}