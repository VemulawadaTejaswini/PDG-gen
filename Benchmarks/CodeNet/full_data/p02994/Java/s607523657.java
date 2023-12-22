import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int l = scan.nextInt();
    int bited = 300;
    int sum = 0;
    for(int i = l; i < l + n; i++){
      sum += i;
      if(Math.abs(i) < Math.abs(bited)){
        bited = i;
      }
    }
    System.out.println(sum - bited);
  }
}