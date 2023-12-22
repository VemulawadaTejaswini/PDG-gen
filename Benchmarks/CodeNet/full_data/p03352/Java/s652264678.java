import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int max = 0;
        for (int B = 1; B < 32; B++) {
        	for (int P = 2; P < 10; P++) {
        		int pow = (int)Math.pow(B, P);
        		if (pow <= X && pow > max) {
        			max = pow;
        		}
        	}
        }
        
        System.out.println(max);
    }
    
}