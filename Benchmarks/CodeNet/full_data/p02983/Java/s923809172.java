import java.util.*;

public class Main {
  public static boolean check(int num) {
    int i;
    for(i = 1; i * i <= num; i++) {
      if(i * i == num) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int i, j, number_l, number_r, temp, flag = 0, ans = 2019;
    Scanner sc = new Scanner(System.in);
    number_l = Integer.parseInt(sc.next());
    number_r = Integer.parseInt(sc.next());
    if(number_l % 2019 == 0) {
      ans = 0;
    } else {
      for(i = number_l; i <= number_r; i++) {
        for(j = number_l + 1; j <= number_r; j++) {
          if(j % 2019 == 0) {
            ans = 0;
            flag = 1;
            break;
          } else if(ans > ((i * j) % 2019)) {
            ans = (i * j) % 2019;
          }
        }
        if(flag == 1) break;
      }
    }
    System.out.println(ans);
  }
}
