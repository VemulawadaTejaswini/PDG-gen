import java.util.Scanner;
class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    int number[] = new int[N];
    for(int k=0;k<N;k++) {
       number[k] = sc.nextInt();
    }
    for (int i=0;i<N;i++) {   
      for (int j=0;j<N;j++) {
        if (i<j) {
         int con = number[i]*number[j];
         sum += con;
        }
      }
    }
    System.out.println(sum);
  }
}