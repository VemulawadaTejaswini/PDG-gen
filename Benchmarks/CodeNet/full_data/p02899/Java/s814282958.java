import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[100000];

    for(int i = 1;i <= n;i++){
      int a = sc.nextInt();
      data[a] = i;
    }

    for(int i = 1;i <= n;i++){
      System.out.println(data[i]);
    }


  }
}
