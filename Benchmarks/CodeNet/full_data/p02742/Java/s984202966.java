import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long yoko = sc.nextInt();
        long tate = sc.nextInt();
        long can = (yoko*tate+1)/2;
        
        System.out.println(can);
    }
}
