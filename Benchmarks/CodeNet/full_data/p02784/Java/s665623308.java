import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        
        int sum = 0;
        
        Integer[] array = new Integer[n];
        for(int i = 0; i < n; ++i) {
            int num = Integer.parseInt(sc.next());
            array[i] = num;
            sum += num;
        }
        
        if(sum >= h) System.out.println("Yes");
        else System.out.println("No");
    }
}