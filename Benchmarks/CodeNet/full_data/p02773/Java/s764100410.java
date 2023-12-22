import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(reader.readLine());
        int maxFreq = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++){
          String word = reader.readLine();
          if (map.containsKey(word)){
            map.put(word, map.get(word) + 1);
          } else {
            map.put(word, 1);
          }
          maxFreq = Math.max(maxFreq, map.get(word));
        }

        List<String> words = new ArrayList<>();
        for (String j : map.keySet()) {
          if (map.get(j) == maxFreq){
            words.add(j+"\n");
          }
        }
        Collections.sort(words);

        for (String k : words){
          System.out.print(k);
        }
    }
}
