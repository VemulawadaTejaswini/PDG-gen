import java.util.Scanner;

public class Main {
  static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    int len = chars.length;
    len = len*len*len;

    int count=-1;
    while (count<len) {
      count++;
      String regex = makeStr(count);
      if (!a.matches(regex)) {
        System.out.println(regex.replaceAll("[\\.\\*]", ""));
        break;
      }
    }
    sc.close();
  }

  private static String makeStr(int count) {
    int len = chars.length;

    if (count<len) {
      return String.format(".*%c.*", chars[count]);
    } else if (count < len*len) {
      int level1 = count/len -1;
      int level2 = count%len;
      return String.format(".*%c.*%c.*", chars[level1],chars[level2]);
    } else {
      int level1 = count/(len*len) -1;
      int level2 = count/len -len;
      int level3 = count%len;
      return String.format(".*%c.*%c.*%c.*", chars[level1],chars[level2],chars[level3]);
    }
  }
}