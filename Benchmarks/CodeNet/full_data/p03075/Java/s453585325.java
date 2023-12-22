import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] a = new int[5];
    for(int i=0; i<5; i++){
      a[i] = Integer.parseInt(in.readLine());
    }
    int k = Integer.parseInt(in.readLine());
    boolean flg = true;

    for(int i=0; i<5; i++){
      for(int j=i+1; j<5; j++){
        if(a[j]-a[i]>k) {
          flg = false;
          break;
        }
      }
    }
    System.out.println(flg==true?"Yay!":":(");
  }
}