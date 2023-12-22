import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 1;
        
        while ((A-1)*count+1 < B ){
            count++;
        }
        System.out.println(count);
    }
}