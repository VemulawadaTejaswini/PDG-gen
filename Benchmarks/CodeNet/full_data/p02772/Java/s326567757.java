import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        Integer[] array = new Integer[n];
        for(int i = 0; i < n; ++i) {
            int num = Integer.parseInt(sc.next());
            array[i] = num;
        }
        
        boolean flag = true;
        int even_counter = 0;
        int counter = 0;
        
        
        for(int item : array) {
            if(item % 2 == 0) {
                ++even_counter;
                if((item % 3 == 0) || (item % 5 ==0)) ++counter;
                else continue;
            }
            else continue;
        }
        
        //System.out.println(even_counter);
        //System.out.println(counter);
        
        if(even_counter == counter) System.out.println("APPROVED");
        else System.out.println("DENIED");
        
    }
}