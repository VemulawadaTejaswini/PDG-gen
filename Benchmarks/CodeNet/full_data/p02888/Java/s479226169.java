import java.util.*;
import java.lang.Math;

class Main {
  private static ArrayList<ArrayList<Integer>> nCombination3(ArrayList<Integer> list) {
    int count = list.size();
    ArrayList<ArrayList<Integer>> pats = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < count - 2; i++) {
      for (int j = i + 1; j < count - 1; j++) {
        for (int k = j + 1; k < count; k++) {
          ArrayList<Integer> a = new ArrayList<Integer>(3);
          a.add(list.get(i));
          a.add(list.get(j));
          a.add(list.get(k));

          pats.add(a);
        }
      }
    }
    return pats;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Integer> L = new ArrayList<Integer>(n);
    for (int i = 0; i < n; i++) {
      L.add(sc.nextInt());
    }

    int count = 0;
    ArrayList<ArrayList<Integer>> pats = nCombination3(L);
    for(ArrayList<Integer> pat : pats) {
      int a = pat.get(0);
      int b = pat.get(1);
      int c = pat.get(2);

      if (a < b + c && b < c + a && c < a+b) {
        count++;
      }
    }

    System.out.println(count);
  }
}