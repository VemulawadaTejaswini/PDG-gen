import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      

      Integer[][] arr = new Integer[m][3];
      for(int i = 0; i < m; i++) {
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
        arr[i][2] = sc.nextInt();
        if(arr[i][0] > arr[i][1]) {
          int t = arr[i][0];
          arr[i][0] = arr[i][1];
          arr[i][1] = t;
          arr[i][2] *= (-1);
        }
      }
      int[] people = new int[n+1];
      Arrays.fill(people, Integer.MAX_VALUE);
      Arrays.sort(arr, (a, b) -> a[0] - b[0]);
      for(int i = 0; i < m; i++) {
        int p1 = arr[i][0];
        int p2 = arr[i][1];
        int dist = arr[i][2];
        if(people[p1] == Integer.MAX_VALUE && people[p2] == Integer.MAX_VALUE) {
          people[p1] = 1; people[p2] = people[p1] + dist;
        } else if(people[p1] == Integer.MAX_VALUE) {
          people[p1] = people[p2] - dist;
        } else if(people[p2] == Integer.MAX_VALUE) {
          people[p2] = people[p1] + dist;
        } else {
          if(people[p2] - people[p1] != dist) {
            System.out.println("No");
            return;
          }
        }
      }

      System.out.println("Yes");
  }
}