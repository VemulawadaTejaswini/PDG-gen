import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = 0;
    for(int x = 0;x < a;x++){
      for(int i = 1+x;i <= a;i++){
        for(int j = i-x;j <= i-x+1;j++){
          b = i * j;
          if(a == b){
            System.out.println(i+j-2);
            System.exit(0);
          }
        }
      }
    }
  }
}