import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int cnt = n + m;
    int total = 0;
    
    for(int i = 0; i < cnt; i++){
      total += i;
    }
    
    int odd = n * m;
    
    System.out.println(total - odd);
  }
}
