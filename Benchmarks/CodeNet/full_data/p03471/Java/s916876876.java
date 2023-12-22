import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int Y = cin.nextInt();
        // 10,000円札をできるだけ取る
        int A = Y / 10000; Y -= A * 10000;
        // 5,000円札をできるだけ取る
        int B = Y / 5000; Y -= B * 5000;
        // 1,000円札をできるだけ取る
        int C = Y / 1000; Y -= C * 5000;
        // 合計枚数がN枚になってたらOK。違ったらNG
        if(A + B + C == N) System.out.println(A + " " + B + " " + C);
        else System.out.println("-1 -1 -1");
    }
}
