import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        
        int max = x > y ? y : x;
        int min = x + y - n > 0 ? x + y - n : 0;
        System.out.println(max + " " + min);
    }
}
