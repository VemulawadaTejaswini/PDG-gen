import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    List<List<Integer>> dotList = new ArrayList<>();
    char[][] A = new char[H][W];
    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < line.length(); j++) {
        A[i][j] = line.charAt(j);
        if (A[i][j] == '.') {
          dotList.add(Arrays.asList(i, j));
        }
      }
    }
    
    int ans = resolve(A, dotList);
    
    System.out.println(ans);
    //System.out.println(Arrays.deepToString(A));
  }


  private static int resolve(char[][] a, List<List<Integer>> dotList) {

    int count = 0;
    while (dotList.size() > 0) {
      List<List<Integer>> newDotList = new ArrayList<>();
      List<List<Integer>> markList = new ArrayList<>();
      for (List<Integer> dot: dotList) {
        if (hasBlack(a, dot.get(0), dot.get(1))) {
          // mark
          markList.add(dot);
        } else {
          newDotList.add(dot);
        }
      }
      
      // update
      for (List<Integer> mark: markList) {
        a[mark.get(0)][mark.get(1)] = '#';
      }
      count++;
      
      dotList = newDotList;
    }    
    
    return count;
  }
  
  private static boolean hasBlack(char[][] a, int i, int j) {
    // up
    return 0 < i && a[i-1][j] == '#'
    // down
      || i < a.length - 1 && a[i+1][j] == '#'
    // left
      || 0 < j && a[i][j-1] == '#'
    // right
      || j < a[i].length - 1 && a[i][j+1] == '#';
  } 
}