import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    ArrayList<Integer> v = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      v.add(scn.nextInt());
    }

    ArrayList<Double> results = new ArrayList<>();

    fullSearch(v, new ArrayList<Integer>(), results);

    System.out.println(Collections.max(results));

  }

  public static void fullSearch(ArrayList<Integer> v, ArrayList<Integer> nums, ArrayList<Double> results) {
    if (v.size() == 0) {
      results.add(compound(nums));
      return;
    } else {
      for (int elem : v) {
        ArrayList<Integer> v_copy = (ArrayList<Integer>) v.clone();
        v_copy.remove(v_copy.indexOf(elem));
        ArrayList<Integer> nums_copy = (ArrayList<Integer>) nums.clone();
        nums_copy.add(elem);

        fullSearch(v_copy, nums_copy, results);
      }

    }

  }

  public static double compound(ArrayList<Integer> nums) {
    double sum = 0;
    for (int i = 0; i < nums.size(); i++) {
      if (i <= 1) {
        sum += nums.get(i);
      } else {
        sum += Math.pow(2, i - 1) * nums.get(i);
      }
    }

    return sum / Math.pow(2, nums.size() - 1);

  }

}
