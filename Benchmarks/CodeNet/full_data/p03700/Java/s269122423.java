import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      String[] sArr = in.readLine().split(" ");
      int N = Integer.parseInt(sArr[0]);
      long A = Long.parseLong(sArr[1]);
      long B = Long.parseLong(sArr[2]);
      Long[] h = new Long[N];

      for(int i=0;i<N;i++){
        h[i] = Long.parseLong(in.readLine());
      }

      Arrays.sort(h, Collections.reverseOrder());

      int see = 0;
      long count = 0;
      int maxIndex = 0;
      long maxValue = Long.MIN_VALUE;
      while(true){
        maxValue = 0;
        maxIndex = 0;
        for(int i=0;i<=see;i++){
          if(maxValue < h[i]){
            maxIndex = i;
            maxValue = h[i];
          }
        }

        see = maxIndex+1 > see && maxIndex+1<N ? maxIndex+1 : see;
        count++;
        h[maxIndex] -= A;
        for(int i=0;i<N;i++){
          if(i==maxIndex){
            continue;
          }
          h[i] -= B;
        }


        boolean next=false;

        for(int i=0;i<=see;i++){
          if(h[i]>0){
            next=true;
          }
        }

        if(next){
          continue;
        }else{
          break;
        }
      }

      System.out.println(count);
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
