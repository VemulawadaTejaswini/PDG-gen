import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    execute();
  }

  private static void execute() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int a = Integer.parseInt(line.split(" ")[0]);

    System.out.println((calc(a) ? "Yes" : "No"));
  }

  private static boolean calc(int a) {
    for (int i = 1; i <= 9; i++){
      double remain = (double)a / i;
      if(remain - (int) remain == 0.0
      && remain <= 9.0){
        return true;
      }
    }
    return false;
  }
}
