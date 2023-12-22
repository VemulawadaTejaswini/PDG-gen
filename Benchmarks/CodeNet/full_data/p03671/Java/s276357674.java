import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	//ココから下にソースを書く
    	Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        	
        int ptn = a + b;
        int ptn2 = a + c;
        int ptn3 = b + c;
        
        if(ptn<ptn2) {
        	if (ptn<ptn3) {
        		System.out.println(ptn);
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
