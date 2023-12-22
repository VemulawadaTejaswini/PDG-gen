import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] line = new int[N];
    double preSum = 0;
    
    for(int i=0;i<N;i++){
    line[i] = sc.nextInt();
      preSum += 1/line[i];
    }
    double Sum = 1/preSum;
    System.out.println(Sum);
  }
}