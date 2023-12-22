import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }   
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long cnt = 0;
        if (N == 1 && M == 1) {
            cnt = 1;
            System.out.println(cnt);
        } else if (N == 1) {
            cnt = M - 2;
            System.out.println(cnt);
        } else if (M == 1) {
            cnt = N - 2;
            System.out.println(cnt);
        } else {
            long N2 = N;
            long M2 = M;
            cnt = (N2 - 2) * (M2 - 2); 
            System.out.println(cnt);
        }   

        return;
    }   

}