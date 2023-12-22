import java.io.*;

public class ChildrenCandies{
  public static void main(String args[]){
    try{
      BufferedReader br = new BuffredReader(new InputStreamReader(System.in));
      String str = br.readLine();
      int N = Integer.parseInt(str);
      int h = 0;
      while(N > 0){
        h = h + N;
        N--;
      }
      System.out.println(N);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}