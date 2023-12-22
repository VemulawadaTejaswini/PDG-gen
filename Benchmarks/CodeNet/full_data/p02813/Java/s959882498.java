import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = new ArrayList<>();
    String data;
    while ((data = br.readLine()) != null) {
      list.add(data);
    }
    br.close();

    int n = Integer.parseInt(list.get(0)); // 大きさ
    String p = list.get(1).replaceAll(" ", ""); // 比較１
    String q = list.get(2).replaceAll(" ", ""); // 比較２

    List<String> li = new ArrayList<>();
    List<String> result = new ArrayList<>();

    String target = "";
    int tmp = 1;
    for (int i = 0; i < n; i++) {
      target += String.valueOf(tmp++);
    }

    String ans = "";
    result = permutation(li, target, ans);

    // 結果
    int pn = result.indexOf(p);
    int qn = result.indexOf(q);
    if (pn > qn) {
      System.out.println(pn - qn);
    } else {
      System.out.println(qn - pn);
    }

  }

  public static List<String> permutation(List<String> list, String target, String ans) {
    if (target.length() <= 1) {
      list.add(ans + target);
    } else {
      for (int i = 0; i < target.length(); i++) {
        permutation(list, target.substring(0, i) + target.substring(i + 1), ans + target.charAt(i));
      }
    }
    return list;
  }

}

