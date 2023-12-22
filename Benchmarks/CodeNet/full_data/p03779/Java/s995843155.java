import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long count = 1;
        long i = 2;
        while(count < x) {
            count += i;
            if(count >= x) break;
            i++;
        }
        System.out.println(i);
    }   
}