import java.util.Scanner;

class Main {
    
    public static void main(String[] areg) {
        Scanner sc = new Scanner(System.in);
		int R = sc.	nextInt();
		int G = sc.	nextInt();
		sc.close();
        
        System.out.println(G * 2 - R);
    }
}