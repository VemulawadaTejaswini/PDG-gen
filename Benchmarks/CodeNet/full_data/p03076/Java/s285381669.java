import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] menu = new int[5];
    for (int i = 0; i < 5; i++){
      menu[i] = Integer.parseInt(br.readLine());
    }
    int temp = 10;
    for (int i = 0; i < 4; i++){
      if (0 < menu[i]%10 && menu[i]%10 < temp){
        temp = menu[i]%10;
      }
    }
    int result = 0;
    for (int i = 0; i < 5; i++){
      result += new BigDecimal(menu[i]).setScale(-1, RoundingMode.UP).intValue();
    }
    System.out.println(result -(10-temp));
  }
}
