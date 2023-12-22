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
//        List<Integer> array = new ArrayList<>();
        int[] array = new int[N];
        for(int i=0; i<N; i++){
//            array.add(sc.nextInt());
            array[i] = sc.nextInt();
        }

        int[] sortedArray = new int[N];
        for(int i=0; i<N; i++){
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray);

        for(int i=0; i<N; i++){
            int mid = -1;
            int num = array[i];

            if(num <= sortedArray[sortedArray.length/2-1]) mid = sortedArray[sortedArray.length/2];
            else mid = sortedArray[sortedArray.length/2-1];
            System.out.println(mid);
        }
    }
}
