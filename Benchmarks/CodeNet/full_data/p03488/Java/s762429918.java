import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int x = sc.nextInt();
      int y = sc.nextInt();

      Map<String, Boolean> memo = new HashMap<>();
      boolean res = dfs(memo, x, y, 0, 0, 0, 0, s);

      System.out.println(res ? "Yes" : "No");
  }

  private static boolean dfs(Map<String, Boolean> memo, int x, int y, int curX, int curY, int curDir, int sIdx, String s) {
      if(memo.containsKey(curX + "-" + curY + "-" + curDir + "-" + sIdx))
        return memo.get(curX + "-" + curY + "-" + curDir + "-" + sIdx);

      if(sIdx == s.length()) {
          return curX == x && curY == y;
      }
      boolean res = false;
      if(s.charAt(sIdx) == 'F') {
        int nextX = curX, nextY = curY;
        if(curDir == 0) {
          nextX++;
        } else if (curDir == 1){
          nextY--;
        }  else if (curDir == 2) {
          nextX--;
        } else {
          nextY++;
        }
        res = dfs(memo, x, y, nextX, nextY, curDir, sIdx + 1, s);
      } else {
        int dir1 = (curDir + 1) % 4; 
        int dir2 = (curDir - 1 + 4) % 4;
        res = dfs(memo, x, y, curX, curY, dir1, sIdx + 1, s) || dfs(memo, x, y, curX, curY, dir2, sIdx + 1, s);
      }
      memo.put(curX + "-" + curY + "-" + curDir + "-" + sIdx, res);
      return res;
  }
}