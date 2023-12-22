import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    

    int[] n = new int[3];
    n[0] = sc.nextInt();
    n[1] = sc.nextInt();
    n[2] = sc.nextInt();

    sc.close();

    Arrays.sort(n);

    int n1 = n[0] + n[1] + n[2];
    int n2 = n[2] * 3;
    int n3 = 0;
    
    if (n1 % 2 == n2 % 2) {
      n3 = n[2];
    } else {
      n3 = n[2] + 1;
    }

    int count = 0;

    if (n3 != n[2]) {
      n[2]++;
      if (n[0] % 2 == 0) {
        n[0]++;
      } else {
        n[1]++;
      }
      count++;
    }

    while (n[1] != n3){
      if (n3 - n[1] == 1) {
        n[1]++;
        n[0]++;
      } else {
        n[1] += 2;
      }
      count++;
    }

    while (n[0] != n3){
      n[0] += 2;
      count++;
    }
    
    System.out.println(count);

  }

}