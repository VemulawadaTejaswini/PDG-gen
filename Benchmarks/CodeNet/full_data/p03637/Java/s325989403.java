import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] count = new int[3];
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      if (a[i] % 4 == 1 || a[i] % 4 == 3){
        count[0]++;
      } else if (a[i] % 4 == 2){
        count[1]++;
      } else if (a[i] % 4 == 0){
        count[2]++;
      }
    }
    if (N >= 4) {
        if (count[0] == count[2] || count[0] < count[2]){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
    if (N == 3){
      if (count[0] == 2 & count[2] == 1){
        System.out.println("Yes");
      } else if (count[0] == 1 & count[1] == 1 & count[2] == 1){
        System.out.println("Yes");
      } else if (count[0] == 1 & count[2] == 2){
        System.out.println("Yes");
      } else if (count[0] == 0){
        System.out.println("Yes");
      } else if (count[1] == 3){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    if (N == 2){
      if (count[0] == 0){
        System.out.println("Yes");
      } else if (count[0] == 1 & count[2] == 1){
        System.out.println("Yes");
      } else if (count[1] == 1 & count[2] == 1){
        System.out.println("Yes");
      } else if (count[2] = 2){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
