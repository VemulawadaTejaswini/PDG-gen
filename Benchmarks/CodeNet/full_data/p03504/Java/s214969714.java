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

      int maxEnd = 0;
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
          maxEnd = Math.max(maxEnd, end);
          allItvs.add(new int[] { start - 1, end});
      }

      int[] itvArr = new int[maxEnd + 1];
      for(int[] itv : allItvs) {
        itvArr[itv[0]]++;
        itvArr[itv[1]]--;
      }
      int min = itvArr[0];
      for(int i = 1; i < itvArr.length; i++) {
        itvArr[i] = itvArr[i] + itvArr[i-1];
        min = Math.max(min, itvArr[i]);
      }

      System.out.println(min);
  }
}

