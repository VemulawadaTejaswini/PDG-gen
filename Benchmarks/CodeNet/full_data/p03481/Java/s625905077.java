import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }   
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();


        int cnt = 0;
        long cur = X;
        while (Y >= cur) {
            cnt++;
            cur *= 2;
        }   

        System.out.println(cnt);

        return;
    }   

}