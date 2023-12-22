import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    String g = scan.next();

    int count = 0;
    int[] a = new int[n];
    for (int i=0;i<n-1;i++){
      if ((g.charAt(i) == 'A') && (g.charAt(i+1) == 'C')){
        count += 1;
      }
      a[i] = count;
    }
    a[n-1] = a[n-2];

    for (int j = 0; j<m ;j++){
      int start = scan.nextInt();
      int end = scan.nextInt();
      int modify = 0;
      if (start == end){
        System.out.println(0);
        continue;
      }
      if (a[end-1] > a[end-2]){
        modify += 1;
      }
      if ((g.charAt(start-1) == 'A') && (g.charAt(start) == 'C')){
        modify -= 1;
      }
      System.out.println(a[end-1] - a[start-1]-modify);
    }
  }
}
