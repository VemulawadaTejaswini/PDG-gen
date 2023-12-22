import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split("");
    int count = 0;
    for(int i=0; i<3; i++) {
      if(str[i].equals("o"))
        count++;
    }
    System.out.println(700+count*100);
  }
}