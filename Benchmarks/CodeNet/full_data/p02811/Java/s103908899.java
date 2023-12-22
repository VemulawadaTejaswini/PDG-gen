import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.nextLine();
        if (s == "ABC"){
           int res = 0;
           res++;
           System.out.println(res);
        }
    }
}