import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;;
import java.util.stream.Stream;
public class Main {
  public static void main (String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inpLen = br.readLine();
    String[] inpArr = br.readLine().split(" ");
    int[]  disInpArr= Stream.of(inpArr).distinct().mapToInt(Integer::parseInt).toArray();
    System.out.print(disInpArr.length);
  }
}