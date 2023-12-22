import java.io.*;
class Main{
  public static void main(String[] args){
    BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
    int A;
    int B;
    String txt;
    try{
      txt = kbd.readLine();
      kbd.close();
    }catch(IOException e){
      e.printStackTrace();
    }
    
    A = Integer.parseInt(txt.substring(0, txt.indexOf(" ")).strip());
    B = Integer.parseInt(txt.substring(txt.indexOf(" "), txt.length()).strip());
    int[] data = {A + B, A - B, A * B};
    System.out.println(Math.max(Math.max(data[0], data[1]), data[2]));
  }
}