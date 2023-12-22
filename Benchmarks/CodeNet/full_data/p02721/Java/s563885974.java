import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  private static final String DELIMITER = " ";
  public static void main(String[] args) throws IOException {
    BufferedReader reader = getReader();
    String input = reader.readLine();
    String[] n_m = input.split(DELIMITER);
    Arrays.stream(n_m).reduce("",(a, b) -> a + b);
    int numbDay = Integer.parseInt(n_m[0]);
    int working = Integer.parseInt(n_m[1]);
    int sleeping = Integer.parseInt(n_m[2]);

    char[] days = reader.readLine().toCharArray();
    if(sleeping == 0){
      return;
    }

    List<Integer> count = new ArrayList<>();
    Set<Integer> result = new TreeSet<>();
    for (int i = 0, d = 0; i < numbDay && d < working; i++) {
      char day = days[i];
      if(day == 'o'){
        count.add(i);
        d++;
        i += sleeping;
      }
    }

    for (int i = numbDay-1, d = 0; i >= 0 && d < working; i--) {
      char day = days[i];
      if(day == 'o'){
        if(count.contains(i)){
          result.add(i);
        }
        d++;
        i -= sleeping;
      }
    }
    result.forEach(r -> System.out.println(r + 1));
  }

  static BufferedReader getReader(){
    return new BufferedReader(new InputStreamReader(System.in));
  }
}