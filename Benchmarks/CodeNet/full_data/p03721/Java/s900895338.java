import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    static class Pair<K, V>{
        K key;
        V val;

        public Pair(K key, V val){
            this.key = key;
            this.val = val;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        List<Pair<Integer, Integer>> operations = new ArrayList<>();

        for(int i = 0; i < N; i++){
            inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            Pair<Integer, Integer> operation = new Pair<>(a, b);
            operations.add(operation);
        }

        operations.sort((Comparator.comparingInt(o -> o.key)));

        long idx = 0;
        for(Pair<Integer, Integer> operation : operations){
            if(idx <= K && K <= idx + operation.val){
                bw.write(String.format("%d\n", operation.key));
                bw.flush();
                return;
            }
            idx += operation.val;
        }
    }
}
