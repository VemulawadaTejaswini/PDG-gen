import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String out;
        if((N % 4) % 7 == 0)
            out = "Yes";
        else if((N % 7) % 4 == 0)
            out = "Yes";
        else if(((N % 11) % 4) % 7 == 0)
            out = "Yes";
        else
            out = "No";
        System.out.println(N + " " + out);
    }
}