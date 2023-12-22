import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String W = sc.nextLine();
    String p = sc.nextLine().replaceAll(" ", "");
    String q = sc.nextLine().replaceAll(" ", "");
    char[] B = p.toCharArray();
    Arrays.sort(B);
    String s = new String(B);
    String g = s;
    ArrayList<String> list = new ArrayList<String>();
    while (true) {
      s = nextPermutation(s, list);
      if (s.equals("Final"))
        break;
    }
    list.add(g);
    Collections.sort(list);
    System.out.println(Math.abs(list.indexOf(p) - list.indexOf(q)));
  }

  public static String nextPermutation(String s, ArrayList<String> arg) {

    ArrayList<Character> list = new ArrayList<>();
    for (int i = 0; i < s.length(); i++)
      list.add(s.charAt(i));

    int pivotPos = -1;
    char pivot = 0;
    for (int i = list.size() - 2; i >= 0; i--) {
      if (list.get(i) < list.get(i + 1)) {
        pivotPos = i;
        pivot = list.get(i);
        break;
      }
    }

    if (pivotPos == -1 && pivot == 0)
      return "Final";

    int L = pivotPos + 1, R = list.size() - 1;
    int minPos = -1;
    char min = Character.MAX_VALUE;
    for (int i = R; i >= L; i--) {
      if (pivot < list.get(i)) {
        if (list.get(i) < min) {
          min = list.get(i);
          minPos = i;
        }
      }
    }

    Collections.swap(list, pivotPos, minPos);
    Collections.sort(list.subList(L, R + 1));

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < list.size(); i++)
      sb.append(list.get(i));

    arg.add(sb.toString());
    return sb.toString();

  }
}
