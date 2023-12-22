import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] p = new int[N];
    for(int i = 0;i < N;i++){
      p[i] = sc.nextInt();
    }
    int max = 0;
    int max_i = 0;

    for(int i = 0;i < N;i++){
      if(max < p[i]){
        max = p[i];
        max_i = i;
      }
    }
    p[max_i] = p[max_i] / 2;
    
    int sum = 0;
    for(int i = 0;i < N;i++){
      sum += p[i];
    }
    System.out.println(sum);
  }
}
