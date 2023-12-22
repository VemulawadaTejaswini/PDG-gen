import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    try{
      String S = sc.readLine();
      List<String> list = new LinkedList<>();
      list.add(S);
      int N = Integer.parseInt(sc.readLine());
      boolean f = true;
      for(int i = 0; i < N; i++){
        String[] T = sc.readLine().split(" ");
        int order = Integer.parseInt(T[0]);
        if(order == 1){
          f = !f;
        }else{
          int o2 = Integer.parseInt(T[1]);
          if(o2 == 1){
            if(f){
              list.add(0, T[2]);
            }else{
              list.add(T[2]);
            }
          }else{
            if(f){
              list.add(T[2]);
            }else{
              list.add(0,T[2]);
            }
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      for(String s : list){
        sb.append(s);
      }
      System.out.println(f ? sb.toString() : sb.reverse().toString());
    }catch(Exception e){
    }
  }
}
