import java.util.*;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a + b  == c + d){
            System.out.println("Balanced");
        } else if(a + b > c + d){
            System.out.println("Left");
        } else {
            System.out.println("Right");
        }
    }
}