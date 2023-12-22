import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    Integer[] L = new Integer[N];
    for (int i = 0; i < N; i++) {
      L[i] = Integer.parseInt(sc.next());
    }
    
    Comparator<Integer> comparator =
     new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };
    Arrays.sort(L, comparator);
    
    int count = 0;
    for (int i = 0; i < N-2; i++) {
      for (int j = i+1; j < N-1; j++) {
        // kはj+1からN-1までの中にいる
        // Lは大きい順にソートされている
        // L[k] > L[i]-L[j] を満たすものを探せば良い
        // 2分岐探索で求めることができるはず
        // L[k_ans]がギリギリ満たすとすると、
        // N-k_ansの数をカウントしてやれば良い
        
        int min = j+1;
        int max = N-1;
        if (L[i] < L[j] + L[max]) {
            count += max - min + 1;
            continue;
        }
        if (L[i] >= L[j] + L[min]) {
            continue;
        }
        
        int k;
        while (true) {
          k = (min + max) / 2;
          if (L[i] < L[j] + L[k]) {
            min = k;
          } else {
            max = k;
          }
          if (max - min <= 1) {
            break;
          }
        }
        count += k - j;
      }
    }
    
    System.out.println(count);
  }
}
