import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    
    for(int i=1; i<=n/2; i++){
      for(int j=n; j>n/2; j--){
        if(n == i+j){
          count++;
        }
      }
    }
    
    System.out.println(count/2);
  }
}
