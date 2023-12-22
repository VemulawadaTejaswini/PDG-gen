import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in = reader.readLine();
    String[] params = in.split(" ");
    int n = Integer.parseInt(params[0]);
    int m = Integer.parseInt(params[1]);
    double div = 1.0 / (4.0 * m);
    String inVotes = reader.readLine();
    int[] voteArray = Arrays.stream(inVotes.split(" "))
        .mapToInt(Integer::valueOf).toArray();
    int sum = Arrays.stream(voteArray).sum();
    double min = sum * div;
    long toVote = Arrays.stream(voteArray)
        .filter(i -> i >= min)
        .count();
    if (toVote < m) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
