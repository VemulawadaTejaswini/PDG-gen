import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int h = Integer.parseInt(reader.readLine());
    System.out.println((a+b)*h/2);}}