import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt();
        Integer b = scan.nextInt();

        if(a > b){
            for(int i=0;i<a;i++)
                System.out.print(b);
        }else{
            for(int i=0;i<b;i++)
                System.out.print(a);
        }
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}
