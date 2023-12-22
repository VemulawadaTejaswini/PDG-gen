import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      int a[i] = sc.nextInt();
    }
    int times = 0;
    while(true){
      boolean F = false;
      for(int i=0;i<n;i++){
        if(a[i]%2 == 1){
          F = true;
        }
      }
      if(F == true){
        System.out.println(0);
        break;
      }else{
        for(int i=0;i<n;i++){
          a[i] /= 2;
        }
      }
      times++;
    }
    System.out.println(times);
  }
}