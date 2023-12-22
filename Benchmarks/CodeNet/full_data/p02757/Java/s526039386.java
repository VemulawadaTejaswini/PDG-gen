import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int n = Integer.parseInt(head[0]);
    int p = Integer.parseInt(head[1]);
    String s = br.readLine();
    br.close();

    int[] s_num = new int[n];
    for(int i = 0; i < n; i++){
      s_num[i] = s.charAt(i) - '0';
    }

    long answer = 0;
    if(p == 2 || p == 5){
      for(int i = 0; i < n; i++){
        if(s_num[i] % p == 0){
          answer += i + 1;
        }
      }
    } else {
      int[] count_of_remain = new int[p];
      Arrays.fill(count_of_remain, 0);
      count_of_remain[0] = 1;
      int pow = 0;
      int num = 0;
      for(int i = n - 1; i >= 0; i--){
        num = num + (s_num[i] * modpow(10, pow, p));
        num = num % p;
        answer += count_of_remain[num];
        count_of_remain[num]++;
        pow++;
      }
    }
    System.out.println(answer);
  }

  static int modpow(int a, int n, int mod){
    int res = 1;
    while(n > 0){
      if((n & 1) == 1){
        res = res * a % mod;
      }
      a = a * a % mod;
      n >>= 1;
    }
    return res;
  }
}
