import java.util.Scanner;
class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int[] c = new int[n];
    for(int i = 0; i < q; i++){
      c[sc.nextInt() - 1]++;
    }
    int a = q - k;
    for(int i = 0; i < n; i++){
      if(c[i] > a){
        System.out.println("Yes");
      }else{
      System.out.println("No");
      }
    }
  }
}