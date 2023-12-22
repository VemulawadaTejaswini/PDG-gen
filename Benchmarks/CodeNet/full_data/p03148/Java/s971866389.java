import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    HashMap<Long, ArrayList<Long>> map = new HashMap<Long, ArrayList<Long>>();
    for(int i = 0; i < n; i++) {
      long t = sc.nextLong();
      long d = sc.nextLong();
      if(map.containsKey(t)) {
        ArrayList<Long> list = map.get(t);
        list.add(d);
        map.put(t, list);
      } else {
        ArrayList<Long> list = new ArrayList<Long>();
        list.add(d);
        map.put(t, list);
      }
    }
    ArrayList<Long> list0 = new ArrayList<Long>();
    ArrayList<Long> list1 = new ArrayList<Long>();
    for(long key : map.keySet()) {
      ArrayList<Long> list = map.get(key);
      Collections.sort(list);
      list1.add(list.get(list.size() - 1));
      for(int i = 0; i < list.size() - 1; i++) {
        list0.add(list.get(i));
      }
    }
    Collections.sort(list0);
    Collections.sort(list1);

    PriorityQueue<Long> pq0 = new PriorityQueue<Long>();
    PriorityQueue<Long> pq1 = new PriorityQueue<Long>(Collections.reverseOrder());

    int p0 = list0.size() - 1;
    int p1 = list1.size() - 1;

    long oisisa = 0;

    for(int i = 0; i < k; i++) {
      if(p0 >= 0) {
        if(p1 >= 0) {
          if(list0.get(p0) >= list1.get(p1)) {
            pq0.add(list0.get(p0));
            oisisa += list0.get(p0);
            p0--;
          } else {
            oisisa += list1.get(p1);
            p1--;
          }
        } else {
          pq0.add(list0.get(p0));
          oisisa += list0.get(p0);
          p0--;
        }
      } else {
        oisisa += list1.get(p1);
        p1--;
      }
    }

    long syurui = (long)(list1.size() - 1 - p1);

    for(int i = p1; i >= 0; i--) {
      pq1.add(list1.get(i));
    }
    
    long ans = oisisa + (syurui * syurui);
    int t = (int)syurui;
    
    for(int i = (t + 1); i <= list1.size(); i++) {
      syurui++;
      long t0 = pq0.poll();
      long t1 = pq1.poll();
      oisisa -= t0;
      oisisa += t1;
      ans = Math.max(ans, (oisisa + (syurui * syurui)));
    }    

    System.out.println(ans);
  }
}