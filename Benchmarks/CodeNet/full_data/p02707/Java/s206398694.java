import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {

        // Listに標準入力の値を取得
        LinkedList<String> scList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (br.ready()) {
                String[] lineArray = br.readLine().split(" ");
                Arrays.<String>stream(lineArray).forEach(s -> scList.add(s.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int n = Integer.parseInt(scList.pop());
        scList.pop();

        HashMap<String, Integer> bossIdMap = new HashMap<>();
        for (String bossId: scList) {
            if (!bossIdMap.containsKey(bossId)) {
                bossIdMap.put(bossId, 1);
            } else {
                bossIdMap.put(bossId, bossIdMap.get(bossId) + 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            int res = 0;
            if (bossIdMap.containsKey(String.valueOf(i))) {
                res = bossIdMap.get(String.valueOf(i));
            }
            System.out.println(res);
        }
    }
}