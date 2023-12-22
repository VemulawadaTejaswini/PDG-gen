import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static ArrayList<int[]> list = new ArrayList<int[]>();
  
	public static void main (String[] args) throws IOException {    
    String[] first = br.readLine().split(" ");
    int N = Integer.parseInt(first[0]);
    int M = Integer.parseInt(first[1]);
    int[][] arr = new int[M][2];
    
    for(int i = 0; i < M; i++) {
      String[] line = br.readLine().split(" ");
      arr[i][0] = Integer.parseInt(line[0]);
      arr[i][1] = Integer.parseInt(line[1]);
    }

    Arrays.sort(arr, new Comparator<int[]>() {
      public int compare(int[] a, int[] b) {
        return Integer.compare(a[1]-a[0], b[1]-b[0]);
      }
    });

    // for(int[] curr : arr) {
    //   System.out.println(Arrays.toString(curr));
    // }
    
    list.add(arr[0]);
    for(int i = 1; i < M; i++) {
      addToList(arr[i], 0, list.size());
    }

    // for(int[] curr : list) {
    //   System.out.print(Arrays.toString(curr) + ", ");
    // }
    // System.out.println();

    System.out.println(list.size());
    
    bw.close();
	}
  
  public static void addToList(int[] target, int L, int R) {
    if(L >= R) {
      list.add(L, target);
    }
    int M = (L+R)/2;
    int[] mid = list.get(M);
    // System.out.println(Arrays.toString(target) + " " + Arrays.toString(mid));
    // // System.out.println(Arrays.toString(list.get(M)));
    // for(int[] curr : list) {
    //   System.out.print(Arrays.toString(curr) + ", ");
    // }
    int status = intersectionStatus(mid, target);
    // System.out.println(status);
    switch(status) {
      case 0:
        list.set(M, target);
        break;
      case 1:
        int[] newArr = {target[0], mid[1]};
        list.set(M, newArr);
        break;
      case 2:
        int[] newArr2 = {mid[0], target[1]};
        list.set(M, newArr2);
        break;
      case 3:
        break;
      case -1:
        if(target[0] > mid[0]) {
          addToList(target, M+1, R);
        }
        else {
          addToList(target, L, M);
        }
    }
  }
  
  public static int intersectionStatus(int[] mid, int[] target) {
    // Target is totally inside mid
    if(mid[0] <= target[0] && mid[1] >= target[1]) {
      return 0;
    }
    // Target partially intersects with mid (right)
    if((target[0] < mid[1] && target[0] >= mid[0])) {
      return 1;
    }
    // Target partially intersects with mid (left)
    if((target[1] <= mid[1] && target[1] > mid[0])) {
      return 2;
    }
    // Mid is totally inside target
    if(mid[0] > target[0] && mid[1] < target[1]) {
      return 3;
    }

    // Target does not intersect with mid
    return -1;
  }
}
