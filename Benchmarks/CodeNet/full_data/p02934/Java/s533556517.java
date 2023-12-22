import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        //String temp = scan.nextLine();
        double A = 0;
        for(int i = 0 ; i < N ; i++){
            A = A + 1 / scan.nextDouble();
        }
        System.out.println(1 / A);
    }
}
