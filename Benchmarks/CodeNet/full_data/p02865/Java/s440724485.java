import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    
    for(int i=0; i<=n; i++){
      int j = n - i;
      if(n == i + j && i != j){
        count++;
      }
    }
    System.out.println(count/2);
  }
}
