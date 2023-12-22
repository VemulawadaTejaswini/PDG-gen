import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }   
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= Math.max(X, Y); i++) {
            int CA = Math.max(0, (X - i) * A); 
            int CB = Math.max(0, (Y - i) * B); 
            int CC = 2 * i * C;
            min = Math.min(min, CA + CB + CC);
        }   

        System.out.println(min);
        return;
    }   

}