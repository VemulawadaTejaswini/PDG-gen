import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line = buffer.readLine();
        int x = Integer.parseInt(line);

        System.out.println(lucas(x));
    }

    public static long lucas(int x) {
      long l0 = 2;
      long l1 = 1;
      long lx = 0;

      if (x == 0){
        return l0;
      } else if (x == 1){
        return l1;
      } else {
        for (int i = 2; i <= x; i++){
          lx = l0 + l1;
          l0 = l1;
          l1 = lx;
        }

        return lx;
      }
    }

}
