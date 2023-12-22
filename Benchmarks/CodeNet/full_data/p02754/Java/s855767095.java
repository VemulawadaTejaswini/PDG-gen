import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        int n = Integer.parseInt(array[0]);
        int a = Integer.parseInt(array[1]);
        int b = Integer.parseInt(array[2]);
        
        int count = n / (a + b);
        int amari = n % (a + b);
        
        int blue = count * a;
        if(amari <= a)
        {
            blue += amari;
        }
        else
        {
            blue += a;
        }
        
        System.out.println(blue);
    }
}
