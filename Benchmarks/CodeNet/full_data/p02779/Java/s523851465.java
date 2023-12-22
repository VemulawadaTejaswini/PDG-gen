import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;;
import java.util.stream.Stream;
public class Main {
  public static void main (String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inpLen = Integer.parseInt(br.readLine());
    String[] inpArr = br.readLine().split(" ");
    int[]  disInpArr= Stream.of(inpArr).distinct().mapToInt(Integer::parseInt).toArray();
    if(inpLen == disInpArr.length){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}