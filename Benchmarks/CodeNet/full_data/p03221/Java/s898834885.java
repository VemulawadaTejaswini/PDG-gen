import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfPrefecture = sc.nextInt();
    int numberOfCity = sc.nextInt();
    int[] city = new int[numberOfCity];
    int[] year = new int[numberOfCity];
    for (int i = 0; i < numberOfCity; i++) {
      city[i] = sc.nextInt();
      year[i] = sc.nextInt();
    }
    for (int i = 0; i < numberOfCity; i++) {
      int count = 1;
      for (int j = 0; j < numberOfCity; j++) {
        if (city[i] == city[j] && year[i] > year[j]) {
          count++;
        }
      }
      String ans = "";
      int zeroPrefecture = 6 - new String().valueOf(city[i]).length();
      int zeroCount = 6 - new String().valueOf(count).length();
      for (int j = 0; j < zeroPrefecture; j++) {
        ans += "0";
      }
      ans += new String().valueOf(city[i]);
      for (int j = 0; j < zeroCount; j++) {
        ans += "0";
      }
      ans += new String().valueOf(count);
      System.out.println(ans);
    }
  }

}
