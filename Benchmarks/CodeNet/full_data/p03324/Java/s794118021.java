import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();

    int sum = 1;

    for(int i=1;i<=d;i++){
      sum = sum * 100;
    }

    System.out.println(sum*(n+n/100));

  }
}
