import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int left = a + b;
        int right = c + d;
        
        if(left > right){
            System.out.println("Left");
        }else if(left == right){
            System.out.println("Balanced");
        }else if(left < right){
            System.out.println("Right");
        }
    }
}
