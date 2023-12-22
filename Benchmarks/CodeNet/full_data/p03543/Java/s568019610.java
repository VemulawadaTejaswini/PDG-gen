import java.io.*;
public class Main{
  public static void main(String[] args){
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      char[] N = bf.readLine().toCharArray();
      boolean flag = N[1] == N[2] && (N[0] == N[1] || N[3] == N[1]);
      System.out.println(flag ? "Yes" : "No");
    } catch(IOException e){}
  }
}
    