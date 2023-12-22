import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int num = parseInt(sc.nextLine());
      int[] number = new int[num];
      String[] tmp = sc.nextLine().split(" ");
      int count = 0;

      for (int i = 0; i < num; i++) {
        number[i] = parseInt(tmp[i]);
      }
      for (int i = 0; i < num; i++) {
        int temp = 0;
        for (int j = i + 1; j < number.length; j++) {
          if (number[j] <= number[i]) {
            temp++;
            i++;
          } else {
            break;
          }
        }
        count = temp > count ? temp : count;
      }
      System.out.println(count);
      sc.close();
      }

      public static int parseInt(String num) {
        return Integer.parseInt(num);
      }
}