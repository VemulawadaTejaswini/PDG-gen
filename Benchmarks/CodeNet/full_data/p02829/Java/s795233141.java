import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        if(x + y == 3){
            System.out.println(3);
        }else if(x + y == 4){
            System.out.println(2);
        }else{
            System.out.println(1);
        }

    }
}