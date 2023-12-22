import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int A = in.nextInt();
        int B = in.nextInt();
 
        printOutcome(A, B);
    }
 
    private static void printOutcome(int A, int B) {
 
 
        String outcome = ((A * B) % 2 == 0) ? "No" : "Yes";
 
        System.out.println(outcome);
 
    }
}