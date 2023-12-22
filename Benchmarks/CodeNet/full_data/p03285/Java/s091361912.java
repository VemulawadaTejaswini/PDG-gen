import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String out;
        if(((N % 11) % 7) % 4 == 0)
            out = "Yes";
        else
            out = "No";
        System.out.println(out);
    }
}
