import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int res = 0;
      	if (n >= 64 && n <= 100) {
        	res = 64;
        } else if (n >= 32 && n <= 63) {
        	res = 32;
        } else if (n >= 16 && n <= 31) {
        	res = 16;
        } else if (n >= 8 && n <= 15) {
        	res = 8;
        } else if (n >= 4 && n <= 7) {
        	res = 4;
        } else if (n >= 2 && n <= 3) {
        	res = 2;
        } else {
        	res = 0;
        }
 		System.out.println(res);
    }
}