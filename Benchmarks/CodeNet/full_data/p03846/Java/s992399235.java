import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int[] a = new int[n];
    int[] dif = new int[n];
    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(scanner.next());
      dif[a[i]] ++;
    }
    scanner.close();

    int ans = 1;
    for(int i=(n+1)%2; i<n; i+=2){
      if(i == 0){
        if(dif[0] != 1){
          System.out.println(0);
          break;
        }
      }else if(dif[i] != 2){
        System.out.println(0);
        break;
      }else if(n-2 <= i){
        for(int j=0; j<n/2; j++){
          ans *= 2;
          ans %= 1000000007;
        }
        System.out.println(ans);
      }
    }
  }
}
