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
    long a = Long.parseLong(line);

    System.out.println((calc(a)));
  }

  private static long calc(long a) {
    long stepCount = a;
    for (long i = 1; i <= a; i++){
      double remain = (double)a / i;
      if(remain - (long) remain == 0.0){
        stepCount = Math.min(stepCount, i + (long) remain);
      }
      if(i*i > a){
        break;
      }
    }
    if(stepCount == a){
      return --stepCount;
    }
    return stepCount - 2;
  }
}