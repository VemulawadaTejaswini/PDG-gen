import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double t = Double.parseDouble(sc.next());
        double x = Double.parseDouble(sc.next());
        
        System.out.println(t/x);
    }
}