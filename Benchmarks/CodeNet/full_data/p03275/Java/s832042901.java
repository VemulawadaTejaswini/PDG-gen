import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        List<Integer> mList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(line[i]));
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < N; j++) {
                List<Integer> subList = list.subList(i, j + 1);
                List<Integer> cloneList = new ArrayList<>(subList);
                Collections.sort(cloneList);
                int index = subList.size() / 2 + 1;
                // out.println(subList.toString() + ", m=" + cloneList.get(index - 1));
                mList.add(cloneList.get(index - 1));
            } 
        }
        int mIndex = mList.size() / 2 + 1;
        Collections.sort(mList);
        out.println(mList.get(mIndex - 1));
        out.close();
    }
}