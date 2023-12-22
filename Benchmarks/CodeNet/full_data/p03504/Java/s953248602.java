import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int c = sc.nextInt();
      Map<Integer, ArrayList<int[]>> channels = new HashMap<>();
      for(int i = 1;  i <= c; i++) {
          channels.put(i, new ArrayList<>());
      }
      for(int i = 0; i < n; i++) {
          int[] itv = new int[]{sc.nextInt(), sc.nextInt()};
          channels.get(sc.nextInt()).add(itv);
      }

      ArrayList<int[]> allItvs = new ArrayList<>();
      for(int i = 1;  i <= c; i++) {
          ArrayList<int[]> itvs = channels.get(i);
          if(itvs.size() == 0) continue;
          Collections.sort(itvs, (itv1, itv2) -> itv1[0] - itv2[0]);
          int start = itvs.get(0)[0];
          int end = itvs.get(0)[1];
          for(int j = 1; j < itvs.size(); j++) {
            int[] itv = itvs.get(j);
            if(itv[0] == end || itv[0] + 1 == end) {
              end = itv[1];
            } else {
              allItvs.add(new int[] { start - 1, end});
              start = itv[0];
              end = itv[1];
            }
          }
          allItvs.add(new int[] { start - 1, end});
      }

      Collections.sort(allItvs, (itv1, itv2) -> itv1[0] == itv2[0] ? itv1[1] - itv2[1] : itv1[0] - itv2[0]);
      PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

      int min = 0;
      for(int[] itv : allItvs) {
          while(!pq.isEmpty() && itv[0] >= pq.peek()[1])
            pq.poll();
          pq.offer(itv);
          min = Math.max(min, pq.size());
      }
      System.out.println(min);
  }
}

