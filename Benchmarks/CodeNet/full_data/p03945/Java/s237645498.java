import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String _n = sc.nextLine();
        char b = 1;
        int num = -1;
        for (char c : _n.toCharArray()){
            if (c != b) {
                b = c;
                num += 1;
            }
        }
        System.out.println(num);

    }
}
