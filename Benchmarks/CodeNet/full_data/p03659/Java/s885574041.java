import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int datalen = Integer.parseInt(br.readLine());
    String d = br.readLine();
    StringTokenizer st = new StringTokenizer(d);

    int[] data = new int[datalen];
    for (int i = 0; i < data.length; i++) {
      data[i] = Integer.parseInt(st.nextToken());
    }

    int sum = 0;
    for (int i = 0; i < data.length; i++) {
      sum += data[i];
    }
    
    int min = Integer.MAX_VALUE;
    int tmp;
    for (int i = 1; i < data.length - 1; i++) {
      tmp = 0;
      
      for (int j = 0; j < i; j++) {
        tmp += data[j];
      }
      
      if (Math.abs(sum - (2*tmp)) < min) {
        min = Math.abs(sum - (2*tmp));
      }
    }

    System.out.println(min);
  }

}
