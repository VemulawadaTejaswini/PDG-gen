
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = n/10;
        n = n%10;
        int c = n/10;
        int d =n%10;
        if(a==7||c==7||d==7){
            System.out.println("Yes");
        }
        else System.out.println("No");
        
    }
}
