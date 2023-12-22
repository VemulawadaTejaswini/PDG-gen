import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double L = Double.parseDouble(sc.next());
        
        System.out.println((L/3)*(L/3)*(L/3));
    }
}