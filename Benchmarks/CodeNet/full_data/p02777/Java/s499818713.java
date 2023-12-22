import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String u = scanner.next();

        if (u.equals(s)){
            a -= 1;
        }else if (u.equals(t)){
            b -= 1;
        }

        System.out.println(a + " " + b);
    }

}