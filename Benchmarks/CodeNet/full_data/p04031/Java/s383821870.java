import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String[] list = bf.readLine().split(" ");

    float sum = 0;
    for (String s : list){
      sum = sum + Integer.parseInt(s);
    }

    int num = Math.round(sum / n);

    int ans = 0;

    for (String s : list){
      ans = ans + (Integer.parseInt(s) - num) * (Integer.parseInt(s) - num);
    }
    System.out.println(ans);
    bf.close();
  }
}