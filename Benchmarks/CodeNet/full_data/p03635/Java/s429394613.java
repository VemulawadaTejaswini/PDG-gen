import java.io.*;

class Main{
  public static void main(String[] args){
    try{
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    String s = br.readLine();
    String[] sp = s.split(" ");
    int x = Integer.parseInt(sp[0]);
    int y = Integer.parseInt(sp[1]);
    System.out.println((x-1)*(y-1));
    }catch(IOException e){
      System.out.println(e);
    }
  }
}