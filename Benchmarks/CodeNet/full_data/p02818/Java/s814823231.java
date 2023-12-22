import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        A-=K;
        if(A < 0){
        	B += A;
        	A = 0;
        }
        sc.close();
        System.out.println(A +" " + B);
    }

}
