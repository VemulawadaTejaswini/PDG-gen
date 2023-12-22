import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
    int total = 0;
    for(int i=1;i<=N;i++){
      d[i] = sc.nextInt();
      if(d[i] == d[i-1]){
        d[i] = 0;
      }
      if(d[i] == 0){
        total ++;
      }
    }
    System.out.println(total);
  }
}