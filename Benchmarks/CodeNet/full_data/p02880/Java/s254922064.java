import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= 9) {
        		if(n%i == 0) {
        			int a = n/i;
        			if(a >= 1 && a <= 9) {
        				System.out.println("Yes");
        				break;
        			}
        		}
        		i++;
        		if(i==10) System.out.println("No");
        }
    }
}