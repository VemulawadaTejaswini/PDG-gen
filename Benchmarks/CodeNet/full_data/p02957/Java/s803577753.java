import java.io.*;

public class Main {

  public static void main(String[] args){

    try{
      String str;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
      str = br.readLine();
String[] ss = str.split(" ");
      //int sample = Integer.parseInt(str);
      func(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]));
    } catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void func(int a, int b){
    if((a+b)%2 == 0){
System.out.println(Math.abs((a+b)/2));
} else System.out.println("IMPOSSIBLE");
  }
}
