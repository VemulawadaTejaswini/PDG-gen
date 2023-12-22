import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a*2 < b ||b*2<a){
              System.out.println("Yay!");
            } else {
              System.out.println(":(");
            }
            }
}