import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String S = scn.nextLine();
    char[] tile = S.toCharArray();

    char[] model1 = new char[tile.length];
    char[] model2 = new char[tile.length];
    for (int i = 0; i < tile.length; i++) {
      model1[i] = String.valueOf(i % 2).toCharArray()[0];
      model2[i] = String.valueOf((i + 1) % 2).toCharArray()[0];
    }

    System.out.println(Math.min(countDiffernce(tile, model1), countDiffernce(tile, model2)));
  }

  public static int countDiffernce(char[] str1, char[] str2) {
    int count = 0;
    for (int i = 0; i < str1.length; i++) {
      if (str1[i] != str2[i]) {
        count++;
      }
    }
    return count;
  }
}