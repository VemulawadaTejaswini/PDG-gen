import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        for(int i = 1; i <= b; i++){
            if(a * i % b == c){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}