import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
        
        for (int i=0;i<n;i++){
            System.out.print(s.substring(i,i+1));
            System.out.print(t.substring(i,i+1));
        }
    }
}