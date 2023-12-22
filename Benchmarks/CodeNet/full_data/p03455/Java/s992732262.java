input java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readline();
    int a = Integer.parseInt(str);
    str = br.readline();
    int b = Integer.parseInt(str);
    if((a * b) % 2 == 0){
      System.out.println("Even");
    else{
      System.out.println("Odd");
    }
  }
}