import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      char[] a=br.readLine().toCharArray();
      long count=0;
      for(int i=0;i<a.length;i++){
        if(a[i]=='+')
         count++;
        else
        count--;
      }
      System.out.println(count);
    }
  }
