import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] time = new int[N + 10];
    int[] x = new int[N + 10];
    int[] y = new int[N + 10];
    time[0] = 0;
    x[0] = 0;
    y[0] = 0;
    boolean isOK = false;

    for (int i = 1; i <= N; i++){
      time[i] = scanner.nextInt();
      x[i] = scanner.nextInt();
      y[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      if ((x[i + 1] + y[i + 1] - x[i] - y[i]) <= (time[i + 1] - time[i]) &&
      (x[i + 1] + y[i + 1] - x[i] - y[i]) % 2 == (time[i + 1]-time[i]) % 2){
        isOK = true;
        break;
      } else {
        isOK = false;
        break;}
    }
    if (isOK == true){
      System.out.println("Yes");
    } else {System.out.println("No");}
  }
}
