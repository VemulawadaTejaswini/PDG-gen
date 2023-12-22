import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        if(n%2 == 0) {
            System.out.println(n/2);
        } else {
            System.out.println((n+1)/2);
        }
    }
}