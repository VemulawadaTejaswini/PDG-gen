import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasOdd = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a % 2 != 0){
                hasOdd = true;
                break;
            }
        }
        System.out.println(hasOdd ? "first" : "second");
        sc.close();

    }

}
