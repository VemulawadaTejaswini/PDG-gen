import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	//ココから下にソースを書く
    	Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        int ptn1 = a + b;
        int ptn2 = a + c;
        int ptn3 = b + c;

        if(ptn1 <ptn2) {
        	if (ptn1 <ptn3) {
        		System.out.println(ptn1);
        	}else {
        		System.out.println(ptn3);
        	}
        }else if(ptn2<ptn3) {
        		System.out.println(ptn2);
        }else {
        		System.out.println(ptn3);
        }

     }

}
