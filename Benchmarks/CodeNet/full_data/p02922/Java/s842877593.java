import java.util.Scanner;
public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int i = 0;i < b;i++){

      if(a*i >= b){
        System.out.println(i);
        break;
      }

    }

  }
}
