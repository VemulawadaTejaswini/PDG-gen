import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int i = 1;
        int a = x;
        while (a <= y){
            a=a*2;
            i++;
        }
       System.out.println(i-1);
    }
    
}
