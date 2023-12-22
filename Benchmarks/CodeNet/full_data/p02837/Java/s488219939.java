import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<HashMap<Integer, Integer>> issues = new ArrayList<HashMap<Integer, Integer>>();
    for (int i=0; i<n; i++) {
      HashMap<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();
      int issueCnt = sc.nextInt();
      for (int j=0; j<issueCnt; j++) {
        tmpMap.put(sc.nextInt(), sc.nextInt());
      }
      issues.add(tmpMap);
    }
    
    int result = 0;
    int max = 0;
    int breakFlg = 0;
    for (int i=0; i<Math.pow(n, 2); i++) {
      result = 0;
      for (int j=0 ; j<n; j++) {
        if ((1&(i>>j))==1) {
          HashMap<Integer, Integer> curIssues = issues.get(j);
          result++;
          if (curIssues.size()>0) {
            for(Integer k : curIssues.keySet()) {
              if (curIssues.get(k-1)==1) {
                if (((i>>(k-1))&1)==1) {
                  
                }
                else {
                  breakFlg = 1;
                  break;
                }
              }
              else {
                if (((i>>(k-1))&1)==0) {
                  
                }
                else {
                  breakFlg = 1;
                  break;
                }
              }
            }
          }
        }
      }
      
      if (breakFlg==1) {
        breakFlg = 0;
        continue;
      }
      if (max<result) {
        max = result;
      }
    }
    
    System.out.println(max);
  }
}
