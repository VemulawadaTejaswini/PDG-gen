import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];

    for(int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }

    int sum = l[n-2];

    Arrays.sort(l);

    for(int i = 0; i < n-2; i++) {
      sum += l[i];
    }

    if(l[n-1] < sum) {
      System.out.println("Yes");
    } else if(l[n-1] >= sum){
      System.out.println("No");
    }

  }

}
