import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int L = sc.nextInt();
    int[] road = new int[N];
    int[] rail = new int[N];
    int index = 1;
    for(int i = 0; i < K; i++) {
      int p = sc.nextInt() - 1;
      int q = sc.nextInt() - 1;
      if(road[p] == 0 && road[q] == 0) {
        road[p] = index;
        road[q] = index;
        index++;
      } else {
        if(road[p] != 0) {
          road[q] = road[p];
        } else {
          road[p] = road[q];
        }
      }
    }
    int index2 = 1;
    for(int i = 0; i < L; i++) {
      int r = sc.nextInt() - 1;
      int s = sc.nextInt() - 1;
      if(rail[r] == 0 && rail[s] == 0) {
        rail[r] = index2;
        rail[s] = index2;
        index2++;
      } else {
        if(rail[r] != 0) {
          rail[s] = rail[r];
        } else {
          rail[r] = rail[s];
        }
      }     
    }
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    for(int i = 0; i < N; i++) {
      long key = (long)N * (long)road[i] + (long)rail[i];
      if(map.containsKey(key)) {
        map.put(key, map.get(key) + 1);
      } else {
        map.put(key, 1);
      }
    }
    for(int i = 0; i < N; i++) {
      long key = (long)N * (long)road[i] + (long)rail[i];
      int ans = map.get(key);
      if(road[i] == 0 || rail[i] == 0) ans = 1;
      if(i == N - 1) {
        System.out.print(ans);
      } else {
        System.out.print(ans + " ");
      }
    }
  }
}