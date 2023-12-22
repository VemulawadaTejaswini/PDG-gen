import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int total = a + b;
        
        if (total % 2 == 0) {
            System.out.println(total / 2);
        } else {
            System.out.println("IMPOSSIBLE");
        }
        
    }
}