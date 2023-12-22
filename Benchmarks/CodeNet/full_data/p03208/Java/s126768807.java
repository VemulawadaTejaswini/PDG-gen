import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N];

    for(int i = 0;i < N;i++){
       h[i] = sc.nextInt();
    }
    sort_down(h);
    
    int min = h[0] - h[N - 1];
    for(int i = 0;i < N - K + 1;i++){
      if(min > h[i] - h[i + K - 1]){
        min = h[i] - h[i + K - 1];
      }
    }

    System.out.println(min);
  }

  public static void sort_down(int[] h){
    int check = 0;
    for(int i = 0;i < h.length - 1;i++){
      if(h[i] < h[i + 1]){
        int tmp;
        tmp = h[i];
        h[i] = h[i + 1];
        h[i + 1] = tmp;
        check++;
      }
    }
    if(check == 0){
      return;
    }
    sort_down(h);
  }
}
