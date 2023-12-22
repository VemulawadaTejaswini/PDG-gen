import java.util.*;


public class Main {
    public static void main(String[] args) {

        String ans;

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A*B%2 == 0){
            ans = "No";
        } else { ans = "Yes";}

        System.out.println(ans);

    }
}
