import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int water = c - (a - b);
        if(water < 0){
            water = 0;
        }
        System.out.println(water);
    }
}