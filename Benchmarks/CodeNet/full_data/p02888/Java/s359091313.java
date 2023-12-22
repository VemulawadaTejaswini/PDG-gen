import java.util.*;

class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      List<Integer> list = new ArrayList<>();
      
      for (int i = 0; i < N; ++i) {
        list.add(Integer.parseInt(sc.next()));
      }
      
      list.sort(Comparator.comparing(Integer::intValue));
      
      int result = 0;
      
      for (int i = 0; i < N - 2; ++i) {
        for (int j = i + 1; j < N - 1; ++j) {
          for (int k = j + 1; k < N; ++k) {
            if (list.get(k) < list.get(i) + list.get(j)) result++;
            else break;
          }
        }
      }
      
      
      System.out.println(result);
    }
}