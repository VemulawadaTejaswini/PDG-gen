import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      long sum = 0;
       for(int i = 1; i <= N; ++i){
           if (!(i % 3 == 0) && !(i % 5 == 0)){
           sum = sum + i;
           }
       }
      System.out.println(sum);
    }
}