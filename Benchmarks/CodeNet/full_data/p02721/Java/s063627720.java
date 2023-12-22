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
    int numbDay = Integer.parseInt(n_m[0]);
    int working = Integer.parseInt(n_m[1]);
    int sleeping = Integer.parseInt(n_m[2]);

    char[] days = reader.readLine().toCharArray();

    List<Integer> count = new ArrayList<>();
    Set<Integer> result = new TreeSet<>();
    int index = 0;
    for (int d = 0; index < numbDay && d < working; index++) {
      char day = days[index];
      if(day == 'o'){
        count.add(index);
        d++;
        index += sleeping;
      }
    }

    for (int d = 0, i = numbDay-1; i >= 0 && d < working; i--) {
      char day = days[i];
      if(day == 'o'){
        if(count.contains(i)){
          result.add(i);
        }
        d++;
        i -= sleeping;
      }
    }
    result.stream().limit(working).forEach(r -> System.out.println(r + 1));
  }

  static BufferedReader getReader(){
    return new BufferedReader(new InputStreamReader(System.in));
  }
}