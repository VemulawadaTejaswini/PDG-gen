
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt();
        if((a<=x)&&(b>=x))System.out.println("YES");
        else System.out.println("NO");
    }
}
