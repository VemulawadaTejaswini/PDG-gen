
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextLine();
        int b = sc.nextLine();
        int c = sc.nextLine();
        int d = sc.nextLine();
        int e = a * b;
        int f = c * d;

        if(e >= f){
            System.out.println(e);
        }else{
            System.out.println(f);
        }
    }
}