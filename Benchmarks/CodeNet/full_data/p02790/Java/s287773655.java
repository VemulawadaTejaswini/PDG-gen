import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str_array = in.readLine().split(" ");
    String a = str_array[0];
    String b = str_array[1];
    String a_result = a;
    String b_result = b;
    for(int cnt = 1; cnt<Integer.parseInt(b); cnt++){
      a_result = a_result + a;
    }
    for(int cnt = 1; cnt<Integer.parseInt(a); cnt++){
      b_result = b_result + b;
    }
    System.out.println(Integer.parseInt(a)<Integer.parseInt(b)?a_result:b_result);
  }
}