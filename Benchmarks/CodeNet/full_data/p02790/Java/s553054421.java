import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        
        String[] array1 = line1.split(" ");
        int a = Integer.parseInt(array1[0]);
        int b = Integer.parseInt(array1[1]);
        
        int min = 0;
        int max = 10;
        if(a < b)
        {
            min = a;
            max = b;
        }
        else
        {
            min = b;
            max = a;
        }
        
        String result = "";
        
        for(int i = 0; i < max; i++)
        {
            String buf = String.valueOf(min);
            result = result + buf;
        }
        
        System.out.println(result);
    }
}
