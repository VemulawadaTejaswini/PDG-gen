import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int ans = n;
    
    while(true){
      int temp = Math.abs(n-k);
      if(ans > temp){
        ans = temp;
      }else{
        break;
      }
    }
    System.out.println(ans);
  }
}