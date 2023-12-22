import java.io.*;

public class OnlineTest {

  public static void main(String[] args){

    try{
      String str;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
      str = br.readLine();
      //int sample = Integer.parseInt(str);
      System.out.println(sample);
    } catch(IOException e){
      e.printStackTrace();
    }
  }

  public static int func(int a, int b){
    return Math.abs(b-a);
  }
}