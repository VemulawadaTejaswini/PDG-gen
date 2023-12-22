import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int plag = 1;
    int count = 0;


    if(2 <= a && a <= 20 && 1<= b && b <= 20){

      for(int i = 1;i < 20;i++){

        if(plag >= b){
          break;
        }

        plag += a-1;
        count++;
      }


      System.out.println(count);
    }

  }

}
