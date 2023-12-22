import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                sc.close();
                int yono = -1;
                while(b >= 0){
                        b -= a;
                        yono++;
                }
                System.out.println(Math.min(c , yono));
        }
}