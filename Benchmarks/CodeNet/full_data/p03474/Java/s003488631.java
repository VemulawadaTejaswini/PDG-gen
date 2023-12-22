import java.util.*;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        boolean result = check(sc);

        toPrint(result);

    }

    public static void toPrint(boolean result) {
        if(result){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        String code = sc.next();
        if(code.charAt(a) != '-' )
            return false;
        for(int i = 0; i < code.length(); i++){
            if(i == a) continue;
            if(!Character.isDigit(code.charAt(i))) return false;
        }

        return true;
    }
}
