import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> array = new ArrayList<>();

        for(int i=0; i<N; i++){
            array.add(sc.nextInt());
        }

        for(int i=0; i<N; i++){
            List<Integer> array2 = new ArrayList<>();
            for(int j: array){
                array2.add(j);
            }
            int mid = -1;
            array2.remove(i);
            Collections.sort(array2);
            mid = array2.get((array2.size()-1)/2);
            System.out.println(mid);
        }
    }
}
