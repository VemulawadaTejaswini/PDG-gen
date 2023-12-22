import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] mon = new int[n + 1];
    int[] brave = new int[n];
    for(int i = 0 ; i < n + 1 ; i++){
      mon[i] = Integer.parseInt(sc.next());
    }
    long cnt = 0L;
    for(int i = 0 ; i < n ; i++){
      brave[i] = Integer.parseInt(sc.next());
      if(brave[i] > mon[i]){
        cnt += mon[i];
        brave[i] -= mon[i];

        if(brave[i] >= mon[i + 1]){
          cnt += mon[i + 1];
          mon[i + 1] = 0;
        }else{
          cnt += brave[i];
          mon[i + 1] -= brave[i];
        }

      }else{
        cnt += brave[i];
      }
    }
    System.out.println(cnt);
  }
}


