import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;
    for(int i = 0; i < N; i++){
        if(i >= N){
            System.out.println("-1" + " " + "-1" + " " + "-1" );
            return;
        }else{
            if(Y > 10000)
            Y = Y % 10000;
            a++;
            if(Y < 10000 && Y > 5000){
                Y = Y % 5000;
                b++;
                if(Y < 5000){
                    Y = Y % 1000;
                    c++;
                }
            }
        }
    }
    System.out.println(a + " " + b + " " + c);
  }
}
