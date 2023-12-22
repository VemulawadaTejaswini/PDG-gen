import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] count = new int[8];
    int max = 8;
    int min = 8;
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      if (a[i] >= 1 & a[i] <= 399){
        count[0] += 1;
      } else if (a[i] >= 400 & a[i] <= 799){
        count[1] += 1;
      } else if (a[i] >= 800 & a[i] <= 1199){
        count[2] += 1;
      } else if (a[i] >= 1200 & a[i] <= 1599){
        count[3] += 1;
      } else if (a[i] >= 1600 & a[i] <= 1999){
        count[4] += 1;
      } else if (a[i] >= 2000 & a[i] <= 2399){
        count[5] += 1;
      } else if (a[i] >= 2400 & a[i] <= 2799){
        count[6] += 1;
      } else if (a[i] >= 2800 & a[i] <= 3199){
        count[7] += 1;
      }
    }
      for (int i = 0; i < N; i++){
        for (int j = 0; j < 8; j++){
          if (a[i] >= 3200 & count[j] != 0){
            count[j] += 1;
            break;
          }
        }
      }
      for (int i = 0; i < 8; i++){
        if(count[i] == 0){
          min -= 1;
        }
      }
      for (int i = 0; i < N; i++){
        for (int j = 0; j < 8; j++){
          if (a[i] >= 3200 & count[j] == 0){
            count[j] += 1;
            break;
          }
        }
      }
      for (int i = 0; i < 8; i++){
        if(count[i] == 0){
          max -= 1;
        }
      }
      System.out.print(min + " " + max);
  }
}
