import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int line = sc.nextInt();
        int column = sc.nextInt();
        
        System.out.println(height*width - line*width -column*height + line*column);
    }
}