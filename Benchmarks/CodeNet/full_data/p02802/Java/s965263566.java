import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int m = scanner.nextInt();
    final List<Submit> submits = new ArrayList<>();
    int correct = 0;
    int penalty = 0;

    for (int i = 0; i < m ; i++) {
      submits.add(new Submit(scanner.nextInt(), scanner.next()));
    }

    for (int i = 0; i < n; i++) {
      final int j = i;
      List<String> iSubmits= submits.stream().filter(e -> e.subject == j + 1).map(e->e.result).collect(
          Collectors.toList());
      if(iSubmits.stream().anyMatch(e->e.equals("AC"))) {
        correct++;
        penalty += iSubmits.indexOf("AC");
      } else {
        penalty += iSubmits.size();
      }
    }
    System.out.println(correct + " " + penalty);
  }

  private static class Submit{
    private int subject;
    private String result;

    Submit(int subject, String result) {
      this.subject = subject;
      this.result = result;
    }
  }
}
