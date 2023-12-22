import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s[] = br.readLine().split("");
    String t[] = br.readLine().split("");
    Arrays.sort(s);
    Arrays.sort(t,Comparator.reverseOrder());
    int flag = 0;
    if(s.length < t.length){
      for(int i = 0;i < s.length;i++){
        if(s[i].equals(t[i])){
          if(i < s.length - 1 && s[i+1].compareTo(t[i+1]) < 0){
            flag = 1;
            break;
          }
        }
      }
    }else{
      for(int i = 0;i < t.length - 1;i++){
        if(s[i].equals(t[i])){
          if(i < t.length - 1 && s[i+1].compareTo(t[i+1]) < 0){
            flag = 1;
            break;
          }
        }
      }
    }
    if(s[0].compareTo(t[0]) <= 0){
      flag = 1;
    }
    if(flag == 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}