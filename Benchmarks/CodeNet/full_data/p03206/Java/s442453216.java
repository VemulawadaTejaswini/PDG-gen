import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
      	int D = sc.nextInt();
      	if (D.equals("Christmas")) {
        	System.out.println("Christmas");
        } else if (D.equals("Christmas Eve")) {
        	System.out.println("Christmas Eve");
        } else if (D.equals("Christmas Eve Eve")) {
        	System.out.println("Christmas Eve Eve");
        } else {
        	System.out.println("Christmas Eve Eve Eve");
        }
    }
}