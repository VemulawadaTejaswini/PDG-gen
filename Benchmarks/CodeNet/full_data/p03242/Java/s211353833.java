import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        s = s.replace('1', '-');
        s = s.replace('9', '1');
        s = s.replace('-', '9');
        
        System.out.println(s);
    }
}