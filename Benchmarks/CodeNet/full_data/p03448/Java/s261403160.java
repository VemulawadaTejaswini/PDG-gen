import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int count = 0;
        
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                for(int k = 0; k < c; k++) {
                    int sum = i * a + j * b + k * c;
                    if(sum == x) count++;
                }
            }
        }
        System.out.println(count);
    }
}