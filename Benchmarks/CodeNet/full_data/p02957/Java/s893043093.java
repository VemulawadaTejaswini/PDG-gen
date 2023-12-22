import java.io.*;

public class Main {

  public static void main(String[] args){

    try{
      String str;
      String str1,str2;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
      str = br.readLine();
      str1 = br.readLine();
      str2 = br.readLine();

      String[] ss1 = str1.split(" ");
      String[] ss2 = str2.split(" ");

      //int sample = Integer.parseInt(str);
      //func(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]));
      ffunc(ss1,ss2);
    } catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void func(int a, int b){
    if((a+b)%2 == 0){
      System.out.println(Math.abs((a+b)/2));
    } else System.out.println("IMPOSSIBLE");
  }

  public static void ffunc(String[] ss1,String[] ss2){
    int ints1[] = new int[ss1.length];
    int ints2[] = new int[ss2.length];
    int count = 0;

    for(int i = 0; i < ss1.length; i++){
      ints1[i] = Integer.parseInt(ss1[i]);
    }
    for(int i = 0; i < ss2.length; i++){
      ints2[i] = Integer.parseInt(ss2[i]);
    }


    for(int i = 0; i < ints2.length; i++){
      if(ints1[i] <= ints2[i]){
        count += ints1[i];
        if(ints1[i+1] > (ints2[i] - ints1[i])){
          ints1[i+1] -= ints2[i] - ints1[i];
          count += (ints2[i] - ints1[i]);
        } else {
          count += ints1[i+1];
          ints1[i+1] = 0;

        }
      }

      else {count += ints2[i];}
    }

    System.out.println(count);
  }
}
