import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = Integer.parseInt(scan.nextLine()); 
        int B = Integer.parseInt(scan.nextLine());
        int C = Integer.parseInt(scan.nextLine());
        scan.close();
        
        int res = C - (A - B);
        res = res < 0 ? 0 : res;
        System.out.println(res);
    }
}