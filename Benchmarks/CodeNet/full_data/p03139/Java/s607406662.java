import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(Math.min(A, B) + " " + Math.max(Math.min(A, B) - (N - Math.max(A, B)), 0));
    }
}