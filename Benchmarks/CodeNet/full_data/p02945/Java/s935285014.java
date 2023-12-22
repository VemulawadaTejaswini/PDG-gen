import java.io.*;
class Main{
  public static void main(String[] args){
    BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
    int A = 0;
    int B;
    String txt = "";
    try{
      txt = kbd.readLine();
      kbd.close();
    }catch(IOException e){
      e.printStackTrace();
    }
    String test1 = txt.substring(0, txt.indexOf(" "));
    A = Integer.parseInt(test1.strip());
    test1 = txt.substring(txt.indexOf(" "), txt.length());
    B = Integer.parseInt(test1.strip());
    int[] data = {A + B, A - B, A * B};
    System.out.println(Math.max(Math.max(data[0], data[1]), data[2]));
  }
}