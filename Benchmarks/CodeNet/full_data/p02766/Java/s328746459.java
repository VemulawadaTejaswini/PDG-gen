import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        long n = Long.parseLong(array[0]);
        long k = Long.parseLong(array[1]);
        
        long count = 0;
        
        while(n > 0)
        {
            n = n / k;
            count++;
        }
        
        System.out.println(count);
    }
}
