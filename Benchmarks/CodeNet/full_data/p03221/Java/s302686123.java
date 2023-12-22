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
      String valueOf = new String().valueOf(city[i]);
      int zeroPrefecture = 6 - valueOf.length();
      String valueOf2 = new String().valueOf(count);
      int zeroCount = 6 - valueOf2.length();
      for (int j = 0; j < zeroPrefecture; j++) {
        ans += "0";
      }
      ans += valueOf;
      for (int j = 0; j < zeroCount; j++) {
        ans += "0";
      }
      ans += valueOf2;
      System.out.println(ans);
    }
  }

}
