import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());;
        int answer = a-2*b;
        if (answer >= 0) {
            System.out.println(answer);
        } else {
            System.out.println(0);
        } 

    }
}