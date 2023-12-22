import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] d = new int[n];
    int max = 0;
    int cur = 0;
    for(int i = 0; i < n; i++){
      d[i] = sc.nextInt();
      if(i < k){
        cur += d[i];
        max = cur;
      }else{
        cur = cur + d[i] - d[i - k];
        max = Math.max(cur,max);
      }
    }
    System.out.println((max + k)/2.0);
  }
}