import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[3];
    for(int i = 0; i < 3; i++) num[i] = Integer.parseInt(sc.next());
    Arrays.sort(num);
    int temp = (num[2] - num[0]) + (num[2] - num[1]);
    int ans;
    if(temp % 2 == 0) ans = temp / 2;
    else ans = 2 + temp / 2;
    System.out.println(ans);
  }
}
