import java.io.*;

public class Main {

  public static void main(String[] args){

    try{
      String str;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
      str = br.readLine();
str=br.readLine();
      String[] ss = str.split(" ");
      //int sample = Integer.parseInt(str);
      //func(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]));
ffunc(ss);
    } catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void func(int a, int b){
    if((a+b)%2 == 0){
      System.out.println(Math.abs((a+b)/2));
    } else System.out.println("IMPOSSIBLE");
  }

  public static void ffunc(String[] ss){

    int ints[] = new int[ss.length];

int count = 0;

    for(int i = 0; i < ss.length; i++){
      ints[i] = Integer.parseInt(ss[i]);
    }

    for (int i = 0; i < ss.length; i++){
      if(ints[i] != i+1)count++;
}
if(count == 2 || count == 0) System.out.println("YES");
else System.out.println("NO");

  }
}
