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

        // 10000円札を0枚からN枚まで全探索する
        for (int A = 0; A <= N; A++){
            // 5000円札を0枚からN枚まで全探索する
            for (int B = 0; B <= N; B++){
                // 1000円札を0枚からN枚まで全探索する
                for(int C = 0; C <= N; C++){
                    //枚数がN枚、かつ金額がY円なら正解
                    int Num = A + B + C;
                    int Money = 10000 * A + 5000 * B + 1000 * C;
                    if(Num == N && Money == Y){
                        System.out.println(A + " " + B + " " + C);
                        return;
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
