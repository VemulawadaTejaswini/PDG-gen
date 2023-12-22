import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new Bufferedreader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
    System.out.println(Math.ceil(c/Math.max(a,b)));
  }
  ]