import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double n = 0;
    for(int i = 0;i<a;i++){
      if(i%2!=0){
        n = n + 1;
      }
    }
    double m = n/(double)a;
    System.out.println(m);
  }
}
