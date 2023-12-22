import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
   
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int k = Integer.parseInt(lines[1]);

      String line = in.readLine();
      int offset=0,next=0;
      char regx = ' ';
      int[] ax = new int[n];
      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regx,offset)) == -1)
          next = line.length();
        ax[i] = Integer.parseInt(line.substring(offset, next));
        offset = next + 1;
      }

      int min = Integer.MAX_VALUE;
      int sumF=0, sumB=0, sum=0;
      for(int i=0; i<n-k+1; i++) {
        sumF = Math.abs(ax[i]) + Math.abs(ax[i+k-1] - ax[i]);
        sumB = Math.abs(ax[i+k-1] + Math.abs(ax[i+k-1]) - ax[i]);
        sum = Math.min(sumF, sumB);
        if(i == 0 || sum < min) min = sum;
      }

      System.out.println(min);
    }
    catch(IOException e) {
      System.out.println(e);
    }
  }
}