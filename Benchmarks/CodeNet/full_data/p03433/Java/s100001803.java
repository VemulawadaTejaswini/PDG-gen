import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        
        N = N % 500;
        
        if(A < N)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}